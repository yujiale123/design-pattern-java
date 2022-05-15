package com.yjl.design.creation.factory.method;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class MainTest {
    public static void main(String[] args) {
        IFactory minCarFactory = new MinCarFactory();
        ICar minCar = minCarFactory.newCar();
        minCar.run();
        IFactory maxCarFactory = new MaxCarFactory();
        ICar maxCar = maxCarFactory.newCar();
        maxCar.run();
    }
}
