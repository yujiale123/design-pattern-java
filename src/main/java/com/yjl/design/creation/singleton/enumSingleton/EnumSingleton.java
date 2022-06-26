package com.yjl.design.creation.singleton.enumSingleton;

/**
 * @Author yujiale
 * @Date 2022/6/26 17:07
 * @Description TODO
 * 枚举实现单例
 * 天然不支持反射创建对应的实例,且有自己的反序列化机制
 * 利用类加载机制保证线程安全.
 **/
public enum EnumSingleton {


    INSTANCE;

    public void print(){
        System.out.println(this.hashCode());
    }

}
