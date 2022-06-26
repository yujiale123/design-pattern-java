package com.yjl.design.creation.factory.simple.actual;

/**
 * @Author yujiale
 * @Date 2022/6/26 17:44
 * @Description TODO
 **/
public class SimpleFactory {
    public static ProducerB createProduct(String type) {
        if ("0"== type) {
            return new ProducerB();
        } else if ("1"==type) {
            return new ProducerB();
        } else {
            return null;
        }
    }
}


