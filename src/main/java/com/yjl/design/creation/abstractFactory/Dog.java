package com.yjl.design.creation.abstractFactory;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println(" 狗 吃 肉 ");
    }
}
