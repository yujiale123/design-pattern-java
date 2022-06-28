package com.yjl.reflection;

import java.lang.reflect.Constructor;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/07
 */
public class GetConstructor {

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.yjl.reflection.Person");

            //1、获取所有的public权限的构造器(getConstructors)
            Constructor<?>[] constructors = aClass.getConstructors();

            //注意查看构造器的顺序
            for (Constructor<?> constructor : constructors) {
                System.out.println("获取所有的public权限的构造器getConstructors:" + constructor);
            }
            System.out.println("-===============================");

            //2、获取所有的构造器(getDeclaredConstructors)
            Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
            for (Constructor<?> declaredConstructor : declaredConstructors) {
                System.out.println("获取所有的构造器getDeclaredConstructors:" + declaredConstructor);
            }
            System.out.println("-===============================");


            //3、获取指定的构造器(放入具体的类型)
            Constructor<?> constructor = aClass.getConstructor(Integer.class);
            System.out.println("获取指定的构造器(放入具体的类型):" + constructor);
            System.out.println("-===============================");
            //非public权限
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, Integer.class);
            System.out.println("获取指定的构造器(放入具体的类型):" + declaredConstructor);
            System.out.println("-===============================");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
