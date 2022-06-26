package com.yjl.design.creation.factory.method.basic;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class Aircraft  implements ITravel{
    @Override
    public void go() {
        System.out.println(" 飞机 go");
    }
}
