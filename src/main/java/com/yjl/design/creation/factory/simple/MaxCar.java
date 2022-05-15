package com.yjl.design.creation.factory.simple;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class MaxCar implements ICar {
    private String engine;

    public MaxCar() {
        this.engine = "大型轿车";
    }

    @Override
    public void run() {
        System.out.println("这个是" + engine);
    }
}
