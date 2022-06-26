package com.yjl.design.creation.factory.method.basic;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class AircraftFactory implements IFactory {

    @Override
    public ITravel newTravel() {
        return new Aircraft();
    }
}
