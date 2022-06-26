package com.yjl.design.creation.prototype.actualcombat.sql;

/**
 * @Author yujiale
 * @Date 2022/6/26 14:24
 * @Description TODO
 **/
public class SearchWord {

    private Long lastUpdateTime;

    private String keyword;

    private Integer count;

    public SearchWord() {
    }

    public SearchWord(Long lastUpdateTime, String keyword, Integer count) {
        this.lastUpdateTime = lastUpdateTime;
        this.keyword = keyword;
        this.count = count;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public String getKeyWord() {
        return keyword;
    }

    public Integer getCount(){
        return count;
    }
}
