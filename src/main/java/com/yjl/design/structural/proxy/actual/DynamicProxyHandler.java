package com.yjl.design.structural.proxy.actual;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author yujiale
 * @Date 2022/6/28 18:42
 * @Description TODO
 **/
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxy;

    public DynamicProxyHandler(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTimeStamp = System.currentTimeMillis();
        Object result = method.invoke(proxy, args);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimeStamp;
        return result;
    }
}
