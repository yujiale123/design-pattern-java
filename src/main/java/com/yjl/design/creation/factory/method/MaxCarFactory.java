package com.yjl.design.creation.factory.method;


/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class MaxCarFactory implements IFactory {
    @Override
    public ICar newCar() {


        ICar maxCar = new MaxCar();
        return ICar;
    }
}
