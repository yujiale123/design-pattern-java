package com.yjl.design.creation.factory.method;

import com.yjl.design.creation.factory.simple.ICar;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class MediumCar implements ICar {

    private String engine;

    public MediumCar() {
        this.engine = "中等轿车";
    }

    @Override
    public void run() {
        System.out.println("这个是" + engine);
    }
}
