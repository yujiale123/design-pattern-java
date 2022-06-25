package com.yjl.design.creation.prototype.basic.shallowCopy;

import java.util.List;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/20
 *  * 原型模式的浅拷贝只会复制对象中基本数据类型和引用对象的内存地址，不会递归地传递复制引用对象以及引用对象的引用对象
 *  * 克隆后的对象与原对象的数据都是共享的
 *  * Object 类的 clone 方法只会拷贝对象中的基本数据类型，比如（int、Long、float）等以及引用对象的内存地址，不会拷贝引用对象本身。
 *
 *  浅拷贝相对于深拷贝，时间和空间上都有很大的缩短。大部分情况可以使用浅拷贝，深拷贝结合场景使用
 */
public class ConcretePrototype implements Cloneable {

    private Integer age;
    private String name;
    private List hobbies;

    @Override
    public ConcretePrototype clone() {

        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
