package com.yjl.design.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/07
 * <p>
 * 实例化对象
 * 创建对象的方式,有new、克隆、反序列化，再加一种，
 * 根据Class对象，使用newInstance()或者构造器实例化对象。
 * <p>
 * 注意事项：
 * newInstance是调用空构造，如果空构造不存在，会出异常，使用其他构造器创建对象比较麻烦，使用空构造非常简单。确保空构造存在
 */
public class NewInstanceMethod {

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.yjl.design.basic.Person");
            //使用newInstance()实例化对象
            Person person = (Person) aClass.newInstance();
            person.setAge(123);
            person.setName("测试");
            person.setAddress("湖北");
            System.out.println(person.toString());
            System.out.println("==================");

            //第二种：通过getDeclaredConstructors()创建对象,取得全部构造函数(注意顺序)
            Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
            for (Constructor<?> declaredConstructor : declaredConstructors) {
                System.out.println("通过getDeclaredConstructors方法：" + declaredConstructor);
            }
            Person newInstance = (Person) declaredConstructors[0].newInstance();
            newInstance.setAddress("ssss");
            newInstance.setAge(20);
            newInstance.setName("张三");
            System.out.println(newInstance.toString());
            System.out.println("==================");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
