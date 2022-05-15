package com.yjl.design.creation.abstractFactory;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class FirstFarm implements Farm {
    @Override
    public Animal newAnimal() {
        return new Dog();
    }

    @Override
    public Plant newPlant() {
        return new Flowers();
    }
}
