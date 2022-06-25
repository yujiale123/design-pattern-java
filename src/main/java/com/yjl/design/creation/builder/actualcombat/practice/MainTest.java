package com.yjl.design.creation.builder.actualcombat.practice;

/**
 * @author yujiale
 */
public class MainTest {

    public static void main(String[] args) {
        ConstructorArg hello = new ConstructorArgArgBuilder().setIsRef(true).setArg("hello").setType(MainTest.class).build();
        System.out.println(hello);
    }
}
