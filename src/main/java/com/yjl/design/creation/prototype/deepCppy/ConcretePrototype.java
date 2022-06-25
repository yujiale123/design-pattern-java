package com.yjl.design.creation.prototype.deepCppy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/20
 *  * 原型模式之深拷贝是完全从原型中复制一份独立的对象,不管是基本数据类型还是引用数据类型都与原型中的基本数据类型和引用数据类型不一样
 *  * 深拷贝的实现方式
 *  - 递归拷贝对象、对象引用以及对象的引用对象，一直拷贝到对象只包含基本数据类型
 *  - 先将对象序列化，然后在反序列化成新对象
 *  - 先采用浅拷贝方式创建 newKeyWords，对于需要更新的 SearchWord 对象，然后在使用深拷贝的方式创建一份新的对象，替换 newKeyWords 中的老对象
 *  第三种实现方式利用浅拷贝节约了时间和空间的有点，又能保证克隆对象中的数据是老版本的数据
 */
public class ConcretePrototype implements Cloneable, Serializable {


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

    public ConcretePrototype deepCloneHobbies() {
        try {
            ConcretePrototype result = (ConcretePrototype) super.clone();
            result.hobbies = (List) ((ArrayList) result.hobbies).clone();
            return result;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototype deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (ConcretePrototype) ois.readObject();
        } catch (Exception e) {
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
