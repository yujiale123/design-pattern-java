package com.yjl.design.creation.builder;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/11/23
 */
public class ComputerBuilder {

    private Computer computer = new Computer();


    public void installDisplayed(String displayer) {
        computer.setDisplayed(displayer);
    }

    public void installMainUnit(String mainUnit) {
        computer.setMainUnit(mainUnit);
    }

    public void installMouse(String mouse) {
        computer.setMouse(mouse);
    }

    public void installKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
    }

    public Computer getComputer() {
        return computer;
    }
}
