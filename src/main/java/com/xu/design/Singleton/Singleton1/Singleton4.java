package com.xu.design.Singleton.Singleton1;

/**
 * 静态内部类
 */
public class Singleton4 {

    /* 私有构造方法，防止被实例化 */
    private Singleton4() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton4 instance = new Singleton4();
    }

    /** 既实现了线程安全，又避免了同步带来的性能影响 */
    public static Singleton4 getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
