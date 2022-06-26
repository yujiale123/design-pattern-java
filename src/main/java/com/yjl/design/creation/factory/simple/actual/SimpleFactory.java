package com.yjl.design.creation.factory.simple.actual;

/**
 * @Author yujiale
 * @Date 2022/6/26 17:44
 * @Description TODO
 * 工厂模式之简单工厂
 * 当每个对象的创建逻辑都比较简单时，适合使用简单工厂，并且容易实现
 * 如果需要添加其他对象，需要对工厂代码进行改动， 违反OCP开放封闭原则
 *
 * 简单工厂模式最大的有点就是工厂内有具体的逻辑去判断生成什么产品，将类的实例化交给了工厂，
 * 这样当我们需要什么产品只需要修改客户端的调用而不需要去修改工厂，对于客户端来说降低了与具体产品的依赖
 *
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


