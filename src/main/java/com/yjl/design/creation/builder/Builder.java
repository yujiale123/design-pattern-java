package com.yjl.design.creation.builder;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 */
public abstract class Builder {

    public abstract void setPart(String arg1, String arg2);

    public abstract Product getProduct();
}