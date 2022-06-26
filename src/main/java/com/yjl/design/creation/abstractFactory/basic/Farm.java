package com.yjl.design.creation.abstractFactory.basic;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 *
 * 抽象工厂
 */
public interface Farm {

    Animal newAnimal();

    Plant newPlant();
}
