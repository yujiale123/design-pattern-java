package com.yjl.design.structural.adapter.basic.combination;

/**
 * @Author yujiale
 * @Date 2022/7/1 21:19
 * @Description TODO
 **/
public class Adaptor implements ITarget{

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        adaptee.fb();
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
