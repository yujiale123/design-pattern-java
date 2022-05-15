package com.yjl.design.creation.builder;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/11/23
 */
public class Computer {

    //显示器
    private String displayed;
    //主机
    private String mainUnit;
    //鼠标
    private String mouse;
    //键盘
    private String keyboard;

    @Override
    public String toString() {
        return "Computer{" +
                "displayed='" + displayed + '\'' +
                ", mainUnit='" + mainUnit + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public String getDisplayed() {
        return displayed;
    }

    public void setDisplayed(String displayed) {
        this.displayed = displayed;
    }

    public String getMainUnit() {
        return mainUnit;
    }

    public void setMainUnit(String mainUnit) {
        this.mainUnit = mainUnit;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
