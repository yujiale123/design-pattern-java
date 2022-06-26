package com.yjl.design.creation.abstractFactory.basic;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class MainTest {
    public static void main(String[] args) {
        Farm firstFarm = new FirstFarm();

        Animal animal = firstFarm.newAnimal();
        animal.eat();
        Plant plant = firstFarm.newPlant();

        plant.bloom();
        Farm twoFarm = new TwoFarm();

        Animal animal1 = twoFarm.newAnimal();
        animal1.eat();

    }
}
