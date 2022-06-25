package com.yjl.design.creation.builder.basicDemo;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class MainTest {
    public static void main(String[] args) {
        Director director = new Director();
        Product product1 = director.getAProduct();
        product1.showProduct();
        Product product2 = director.getBProduct();
        product2.showProduct();
    }
}
