package com.yjl.design.creation.abstractFactory.basic;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class Flowers implements Plant {
    @Override
    public void bloom() {
        System.out.println("花 开会");
    }
}
