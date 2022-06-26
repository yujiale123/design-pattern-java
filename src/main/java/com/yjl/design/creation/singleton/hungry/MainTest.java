package com.yjl.design.creation.singleton.hungry;

/**
 * @Author yujiale
 * @Date 2022/6/26 16:30
 * @Description TODO
 **/
public class MainTest {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance1 = HungrySingleton.getInstance();
        System.out.println(instance == instance1);
    }
}
