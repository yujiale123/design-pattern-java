package com.yjl.design.structural.adapter.basic.extendsIs;

/**
 * @Author yujiale
 * @Date 2022/7/1 21:08
 * @Description TODO
 **/
public class Adaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {

    }
}
