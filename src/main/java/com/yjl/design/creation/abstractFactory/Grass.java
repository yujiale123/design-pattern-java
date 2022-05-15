package com.yjl.design.creation.abstractFactory;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class Grass implements Plant {
    @Override
    public void bloom() {
        System.out.println("草 开花");
    }
}
