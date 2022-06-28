package com.yjl.reflection;

import java.lang.reflect.Modifier;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/07
 */
public class GetModifiersMethod {

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.yjl.reflection.Person");

            //获得修饰符
            int modifiers = aClass.getModifiers();
            //使用Modifier转换为相应的字符串
            System.out.println("通过反射获取类的修饰符"+Modifier.toString(modifiers));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
