package com.yjl.design.basic;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/07
 */
public class PrivateClass {
    private String MSG = "Original";

    private final String FINAL_VALUE = "hello";


    private void privateMethod(String head, int tail) {
        System.out.print(head + tail);
    }

    public String getMsg() {
        return MSG;
    }

    public String getFinalValue() {
        return FINAL_VALUE;
    }
}
