package com.yjl.reflection;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/07
 */
public class GetClassMethod {

    public static void main(String[] args) {
        GetClassMethod1();
        GetClassMethod2();
        GetClassMethod3();
    }


    /**
     * 反射获取方法一：通过new对象，然后使用对象.getClass来使用
     */
    public static void GetClassMethod1() {
        Person person = new Person();
        System.out.println("使用对象.getClass来使用反射前的Person：" + person);
        Class<? extends Person> aClass = person.getClass();
        System.out.println("使用对象.getClass来使用反射后的Person：" + aClass);
    }


    /**
     * 反射获取方法二：直接使用类.class来使用
     */
    public static void GetClassMethod2() {
        Class<Person> aClass = Person.class;
        System.out.println("使用类.class反射后的Person：" + aClass);
    }


    /**
     * 反射获取方法三（推荐使用）：使用Class.forName()。forName中包含需要反射的包路径和包名
     */
    public static void GetClassMethod3() {
        try {
            System.out.println("使用Class.forName()来使用反射前的Person：" + Class.class);
            Class<?> aClass = Class.forName("com.yjl.reflection.Person");
            System.out.println("使用Class.forName(com.yjl.reflection.Person)来使用反射前的Person：" + aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
