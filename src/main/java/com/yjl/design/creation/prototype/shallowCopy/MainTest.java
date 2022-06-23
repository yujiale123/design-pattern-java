package com.yjl.design.creation.prototype.shallowCopy;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/20
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
        cloneType.setAge(30);
        System.out.println("原型对象：" + concretePrototype);
        System.out.println("克隆对象：" + cloneType);
        System.out.println(concretePrototype == cloneType);
        System.out.println("原型对象的爱好：" + concretePrototype.getHobbies());
        System.out.println("克隆对象的爱好：" + cloneType.getHobbies());
        System.out.println(concretePrototype.getHobbies() == cloneType.getHobbies());
    }
}
