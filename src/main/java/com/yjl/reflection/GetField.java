package com.yjl.reflection;

import java.lang.reflect.Field;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/07
 */
public class GetField {

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.yjl.reflection.Person");

            System.out.println("+============");
            //获取全部字段
            Field[] declaredFields = aClass.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                int modifiers = declaredFields[i].getModifiers();
                System.out.println("字段的修饰符：" + modifiers);
                Class<?> type = declaredFields[i].getType();
                System.out.println("字段的类型：" + type);
                String name = declaredFields[i].getName();
                System.out.println("字段的名字：" + name);
                System.out.println("================");

            }

            System.out.println("--------------------");

            Field[] fields = aClass.getFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println("字段的所有属性：" + fields[i]);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
