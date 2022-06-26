package com.yjl.design.creation.factory.simple.actual;

/**
 * @Author yujiale
 * @Date 2022/6/26 17:58
 * @Description TODO
 **/
public class ProducerB implements Producer{
    @Override
    public void method() {
        System.out.println("Producer B");
    }
}
