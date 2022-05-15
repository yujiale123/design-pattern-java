package com.yjl.design.creation.factory.method;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class Car implements ITravel {
    @Override
    public void go() {
        System.out.println("汽车 go");
    }
}
