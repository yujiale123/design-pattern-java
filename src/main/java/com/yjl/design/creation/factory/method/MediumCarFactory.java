package com.yjl.design.creation.factory.method;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class MediumCarFactory implements IFactory{
    @Override
    public MaxCar newCar() {
        return (ICar) new MediumCar();
    }
}
