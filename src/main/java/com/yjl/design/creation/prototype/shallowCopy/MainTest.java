package com.yjl.design.creation.prototype.shallowCopy;

import java.util.ArrayList;
import java.util.List;


/**
 * @author yujiale
 *
 * 原型模式的浅拷贝只会复制对象中基本数据类型和引用对象的内存地址，不会递归地传递复制引用对象以及引用对象的引用对象
 * 克隆后的对象与原对象的数据都是共享的
 * Object 类的 clone 方法只会拷贝对象中的基本数据类型，比如（int、Long、float）等以及引用对象的内存地址，不会拷贝引用对象本身。
 */
public class MainTest {

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(20);
        concretePrototype.setName("张三");
        List hobbies = new ArrayList();
        hobbies.add("游戏");
        hobbies.add("篮球");
        concretePrototype.setHobbies(hobbies);

        ConcretePrototype cloneType = concretePrototype.clone();
        cloneType.getHobbies().add("技术");
        cloneType.setName("李四");
        System.out.println("原型对象：" + concretePrototype);
        System.out.println("克隆对象：" + cloneType);
        System.out.println(concretePrototype == cloneType);
        System.out.println(concretePrototype.getAge().equals(cloneType.getAge()));
        System.out.println("原型对象的爱好：" + concretePrototype.getHobbies());
        System.out.println("克隆对象的爱好：" + cloneType.getHobbies());
        System.out.println(concretePrototype.getHobbies() == cloneType.getHobbies());
    }
}
