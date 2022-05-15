package com.yjl.design.creation.builder;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }
}
