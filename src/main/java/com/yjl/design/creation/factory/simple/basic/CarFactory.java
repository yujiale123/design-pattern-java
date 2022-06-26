package com.yjl.design.creation.factory.simple.basic;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class CarFactory {


    public ICar newCar(String type) {

        if ("min" == type) {
            return new MinCar();
        } else if ("max" == type) {
            return new MaxCar();
        } else {
            return new MediumCar();
        }

    }
}
