package com.yjl.design.creation.factory.method;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class MainTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        ITravel car = carFactory.newTravel();
        car.go();

    }
}
