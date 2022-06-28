package com.yjl.reflection;

import java.lang.reflect.Method;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/07
 */
public class GetMethod {

    public static void main(String[] args) {
        try {
            final Class<?> aClass = Class.forName("com.yjl.reflection.Person");

            System.out.println("通过反射获取方法");

            //取得全部公共方法
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                //修饰符
                int modifiers = method.getModifiers();
                //返回值类型
                Class<?> returnType = method.getReturnType();
                //方法名
                String name = method.getName();
                //方法参数
                Class<?>[] parameterTypes = method.getParameterTypes();

                System.out.println("修饰符：" + modifiers + ";" + "返回值类型" + returnType + ";" + "方法名" + name + ";" + "方法参数" + parameterTypes);
                System.out.println("==================");

            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
