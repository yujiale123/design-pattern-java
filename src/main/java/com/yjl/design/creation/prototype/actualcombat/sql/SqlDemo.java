package com.yjl.design.creation.prototype.actualcombat.sql;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author yujiale
 * @Date 2022/6/25 22:05
 * @Description TODO
 * <p>
 * 实战场景描述：
 * 假设数据库中存储了大约 10 万条“搜索关键词”信息，每条信息包含关键词、关键词被搜索的次数、信息最近被更新的时间等。
 * 系统 A 在启动的时候会加载这份数据到内存中，用于处理某些其他的业务需求。
 * 为了方便快速地查找某个关键词对应的信息，我们给关键词建立一个散列表索引。
 * 另外一个系统 B，专门用来分析搜索日志，定期（比如间隔 10 分钟）批量地更新数据库中的数据，并且标记为新的数据版本。
 **/
public class SqlDemo {

    private ConcurrentHashMap<String, SearchWord> currentSearchWords = new ConcurrentHashMap<String, SearchWord>();

    private HashMap<String, SearchWord> currentSearchWords01 = new LinkedHashMap<>();
    private long lastUpdateTime = -1;

    /**
     * * 只需要在系统 A 中，记录当前数据的版本 Va 对应的更新时间 Ta，从数据库中捞出更新时间大于 Ta 的所有搜索关键词，也就是找出 Va 版本与最新版本数据的“差集”，
     * 然后针对差集中的每个关键词进行处理。如果它已经在散列表中存在了，我们就更新相应的搜索次数、更新时间等信息；如果它在散列表中不存在，我们就将它插入到散列表中。
     */
    public void refresh() {
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdateTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdateTime) {
                maxNewUpdateTime = searchWord.getLastUpdateTime();
            }
            if (currentSearchWords.containsKey(searchWord.getKeyWord())) {
                currentSearchWords.replace(searchWord.getKeyWord(), searchWord);
            } else {
                currentSearchWords.put(searchWord.getKeyWord(), searchWord);
            }
        }
        lastUpdateTime = maxNewUpdateTime;
    }

    /**
     * 任何时刻，
     * 系统 A 中的所有数据都必须是同一个版本的，要么都是版本 a，要么都是版本 b，不能有的是版本 a，有的是版本 b。
     * 那刚刚的更新方式就不能满足这个要求了。除此之外，我们还要求：在更新内存数据的时候，系统 A不能处于不可用状态，也就是不能停机更新数据。
     * <p>
     * 把正在使用的数据的版本定义为“服务版本”，当我们要更新内存中的数据的时候，我们并不是直接在服务版本（假设是版本 a 数据）上更新，
     * 而是重新创建另一个版本数据（假设是版本 b 数据），等新的版本数据建好之后，再一次性地将服务版本从版本 a 切换到版本 b。
     * 这样既保证了数据一直可用，又避免了中间状态的存在。
     */
    public void refresh01() {
        HashMap<String, SearchWord> newKeyWords = new LinkedHashMap<>();


        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            newKeyWords.put(searchWord.getKeyWord(), searchWord);
        }
        currentSearchWords01 = newKeyWords;
    }


    /**
     * 拷贝 currentKeywords 数据到 newKeywords 中，然后从数据库中只捞出新增或者有更新的关键词，更新到 newKeywords 中。
     * 而相对于 10 万条数据来说，每次新增或者更新的关键词个数是比较少的，所以，这种策略大大提高了数据更新的效率。
     */
    public void refresh02() {
        HashMap<String, SearchWord> newKeyWords = (HashMap<String, SearchWord>) currentSearchWords01;


        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdateTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdateTime) {
                maxNewUpdateTime = searchWord.getLastUpdateTime();
            }
            if (newKeyWords.containsKey(searchWord.getKeyWord())) {
                SearchWord oldSearchWord = newKeyWords.get(searchWord.getKeyWord());
                oldSearchWord.setCount(searchWord.getCount());
                oldSearchWord.setLastUpdateTime(searchWord.getLastUpdateTime());
            } else {
                newKeyWords.put(searchWord.getKeyWord(), searchWord);
            }
        }
        currentSearchWords01 = newKeyWords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        return null;
    }
}

