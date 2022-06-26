package com.yjl.design.creation.singleton.InnerClassSingleton;

/**
 * @Author yujiale
 * @Date 2022/6/26 16:45
 * @Description TODO
 **/
public class MainTest {
    public static void main(String[] args) {
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
}
