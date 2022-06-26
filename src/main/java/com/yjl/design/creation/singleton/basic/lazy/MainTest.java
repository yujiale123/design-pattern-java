package com.yjl.design.creation.singleton.basic.lazy;

/**
 * @Author yujiale
 * @Date 2022/6/26 15:43
 * @Description TODO
 **/
public class MainTest {
    public static void main(String[] args) {
        test02();
    }

    public static void test01(){
        LazySingleton lazySingleton01 = LazySingleton.getInstance();
        LazySingleton lazySingleton02 = LazySingleton.getInstance();
        System.out.println(lazySingleton01 == lazySingleton01);
    }

    /**
     * 多线程
     */
    public static  void test02(){
        new Thread( ()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();

        new Thread( ()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();
    }
}
