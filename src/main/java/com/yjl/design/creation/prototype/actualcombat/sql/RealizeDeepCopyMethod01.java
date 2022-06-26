package com.yjl.design.creation.prototype.actualcombat.sql;

import java.util.HashMap;
import java.util.List;

/**
 * @Author yujiale
 * @Date 2022/6/26 14:27
 * @Description 实现深拷贝方法01
 **/
public class RealizeDeepCopyMethod01 {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();

    private Long lastUpdateTime = -1L;

    public void refresh() {
        HashMap<String, SearchWord> newKeywords = new HashMap<>();
        for (HashMap.Entry<String, SearchWord> entry : currentKeywords.entrySet()) {
            SearchWord searchWord = entry.getValue();
            SearchWord newSearchWord = new SearchWord(searchWord.getLastUpdateTime(), searchWord.getKeyWord(), searchWord.getCount());
            newKeywords.put(entry.getKey(), newSearchWord);
        }
        //从数据库中取出更新时间 > lastUpdateTime 的数据，放入到 newKeywords 中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if
            (
                    newKeywords.containsKey(searchWord.getKeyword())) {
                SearchWord oldSearchWord = newKeywords.get(searchWord.getKeyword());
                oldSearchWord.setCount(searchWord.getCount());
                oldSearchWord.setLastUpdateTime(searchWord.getLastUpdateTime());
            } else {
                newKeywords.put(searchWord.getKeyword(), searchWord);
            }
        }
        lastUpdateTime = maxNewUpdatedTime;
        currentKeywords = newKeywords;

    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        return null;
    }

}
