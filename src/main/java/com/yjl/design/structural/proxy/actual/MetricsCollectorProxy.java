package com.yjl.design.structural.proxy.actual;

import java.lang.reflect.Proxy;

/**
 * @Author yujiale
 * @Date 2022/6/28 17:57
 * @Description TODO
 *
 * Spring AOP 底层的实现原理就是基于动态代理。用户配置好需要给哪些类创建代理，并定义好在执行原始类的业务代码前后执行哪些附加功能。
 * Spring 为这些类创建动态代理对象，并在 JVM 中替代原始类对象。
 * 原本在代码中执行的原始类的方法，被换作执行代理类的方法，也就实现了给原始类添加附加功能的目的。
 **/
public class MetricsCollectorProxy {
    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public  Object createProxy(Object proxy) {
        Class<?>[] interfaces = proxy.getClass().getInterfaces();
        DynamicProxyHandler proxyHandler = new DynamicProxyHandler(proxy);
        return Proxy.newProxyInstance(proxy.getClass().getClassLoader(),interfaces,proxyHandler);
    }
}
