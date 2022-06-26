package com.yjl.design.creation.singleton.lazy;

/**
 * @Author yujiale
 * @Date 2022/6/26 15:41
 * @Description TODO
 * <p>
 * 单例模式之懒汉模式：延迟加载，只有在被使用的时候才会被实例化
 * 优点
 * - 第一次调用时才初始化,避免内存浪费
 * 缺点
 * - 必须加锁才能保证单例，而锁的存在于影响运行效率
 *
 **/
public class LazySingleton {
    /**
     * volatile 防止编译器和 Cpu 对指令重排，
     * 如果两个线程并发,第一个线程执行了 (指令被重排)1,3步骤时(instance引用赋值了,但并未初始化)此时第二个线程进来,在最外层判空为false,直接返回,此时可能会出现空指针异常.
     */
    private volatile static LazySingleton instance;

    private LazySingleton() {
    }

    /**
     * 线程安全问题：多线程进行访问创建时,可能会出现线程安全问题.(加上Thread.sleep()可以使问题放大),破坏了单例的定义
     * 优化一
     * 在获取对象的方法加上synchronized,能保证单例,但会损耗性能.
     * 优化二
     * 延迟加锁
     *  防止资源浪费,在instance判空后,进行加锁,在instance不为空时,不进行加锁.
     *  由于在判空后进行加锁, 还是可能会出现线程安全问题.
     *  所以在加锁后再进行一次判空在加锁处还是可能会出现线程并发,资源浪费的问题.
     * @return
     */
    public static LazySingleton getInstance() {
        if (null == instance) {
            synchronized (LazySingleton.class) {
                if (null == instance) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

