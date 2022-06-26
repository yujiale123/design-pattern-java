package com.yjl.design.creation.singleton.hungry;

/**
 * @Author yujiale
 * @Date 2022/6/26 16:26
 * @Description TODO
 * <p>
 * 饿汉模式
 * 类加载的初始化阶段就完成了实例的初始化.本质上就是借助于jvm类加载机制,保证实例的唯一性.
 *
 * 类加载过程：
 *  1、加载二进制数据到内存中，生成对应的 Class 数据结构
 *  2、连接；a、验证，b、准备（给类的静态成员变量赋默认值），c、解析
 *  3、初始化：给类的静态变量赋初值
 *
 *  jvm能保证以上三步操作只完成一次
 *
 *  注意：只有在真正使用对应的类时，才会触发初始化（当前类是启动类即main 所在类，直接进行 new 操作、访问静态属性、访问静态方法、用反射访问类等情况
 **/
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

  public   HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }


}
