package com.yjl.design.creation.singleton.basic.InnerClassSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author yujiale
 * @Date 2022/6/26 16:45
 * @Description TODO
 **/
public class MainTest {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        test03();
    }

    public static void test01() {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        System.out.println(instance == instance1);

        new Thread(() -> {
            InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
            System.out.println(instance2);
        }).start();

        new Thread(() -> {
            InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
            System.out.println(instance2);
        }).start();
    }

    public static void test02() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        InnerClassSingleton innerClassSingleton = declaredConstructor.newInstance();
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        System.out.println(instance == innerClassSingleton);

    }

    /**
     * 序列化:
     * <p>
     * 1)可以利用指定方法来替换从反序列化流中的数据
     * 序列化就是把一个java对象变成二进制内容,本质上就是一个byte[]数组.
     * 为什么要把要把java对象序列化呢?
     * 因为序列化后可以把byte[]数组保存到文件中或者通过网络传输到远程
     * 反序列化:
     * 就是把一个文件中的或者网络上接收到的二进制内容(即byte[]数组)变回java对象.
     *
     * @throws ClassNotFoundException
     */
    public static void test03() throws IOException, ClassNotFoundException {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test"));
        oos.writeObject(instance);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test"));
        Object o = ois.readObject();
        System.out.println(o);
    }
}
