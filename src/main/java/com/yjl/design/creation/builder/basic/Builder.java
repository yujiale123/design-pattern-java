package com.yjl.design.creation.builder.basic;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/15
 *
 * 建造者模式
 */
public abstract class Builder {

    public abstract void setPart(String arg1, String arg2);

    public abstract Product getProduct();
}