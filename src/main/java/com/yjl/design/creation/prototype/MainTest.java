package com.yjl.design.creation.prototype;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/09
 * <p>
 * 原型模式:是用于创建重复的的对象，又能保持性能
 * 1、Mybatis：   操作数据库了，从数据库中有很多记录都不会被修改
 * 2、每次查询数据库，查到以后把所有的数据封装到一个对象中返回
 * 2.1、一千个线程：查询一个记录：new User（"张三"，18，""）；每次创建一个对象封装并返回
 * 系统就会有一千个User；浪费了很多内存
 * 3、解决：缓存：查过的保存
 * 如果再查相同的对象，拿到原型对象
 *
 * 4、进入原型模式
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Mybatis mybatis = new Mybatis();
        User user1 = mybatis.getUser("张三");
        System.out.println("1-->张三1自己改的：" + user1);
        user1.setName("王五");
        User user2 = mybatis.getUser("张三");
        System.out.println("2-->" + user2);
        User user3 = mybatis.getUser("张三");
        System.out.println("3-->" + user3);
        User user4 = mybatis.getUser("张三");
        System.out.println("4-->" + user4);
    }
}
