package com.yjl.design.creation.singleton.InnerClassSingleton;

/**
 * @Author yujiale
 * @Date 2022/6/26 16:43
 * @Description TODO
 * <p>
 * 静态内部类实现单例模式
 *  本质上是利用类的加载机制来保证线程安全
 *  只有在实际使用的时候，才会触发类的初始化，本质上也是一种懒加载的一种形式
 **/
public class InnerClassSingleton {
    private static class InnerClassSingletonHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }


    private InnerClassSingleton() {

    }

    public static InnerClassSingleton getInstance() {
        InnerClassSingleton instance = InnerClassSingletonHolder.instance;
        return instance;
    }

}
