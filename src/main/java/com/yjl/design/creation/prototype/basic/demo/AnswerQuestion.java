package com.yjl.design.creation.prototype.basic.demo;

/**
 * @Author yujiale
 * @Date 2022/6/25 18:09
 * @Description 问答题
 **/
public class AnswerQuestion {

    /**
     * 问题
     */
    private String name;

    /**
     * 答案
     */
    private String key;

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
