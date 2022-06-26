package com.yjl.design.creation.abstractFactory.basic;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class Cattle implements Animal {
    @Override
    public void eat() {
        System.out.println("牛 吃 草");
    }
}
