package com.yjl.design.creation.singleton.enumSingleton;

/**
 * @Author yujiale
 * @Date 2022/6/26 17:08
 * @Description TODO
 **/
public class MainTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        System.out.println(instance1 == instance);
    }
}
