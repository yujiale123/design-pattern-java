package com.yjl.design.creation.singleton.InnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author yujiale
 * @Date 2022/6/26 16:45
 * @Description TODO
 **/
public class MainTest {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        test02();
    }

    public  static  void test01(){
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        System.out.println(instance == instance1);

        new Thread( ()->{
            InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
            System.out.println(instance2);
        }).start();

        new  Thread( ()->{
            InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
            System.out.println(instance2);
        }).start();
    }

    public  static  void test02() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        InnerClassSingleton innerClassSingleton = declaredConstructor.newInstance();
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        System.out.println(instance == innerClassSingleton);

    }
}
