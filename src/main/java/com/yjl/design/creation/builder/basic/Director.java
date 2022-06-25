package com.yjl.design.creation.builder.basic;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.setPart("宝马汽车", "X7");
        return builder.getProduct();
    }

    public Product getBProduct() {
        builder.setPart("奥迪汽车", "Q5");
        return builder.getProduct();
    }
}
