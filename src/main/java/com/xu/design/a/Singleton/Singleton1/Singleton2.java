package com.xu.design.a.Singleton.Singleton1;

/**
 * 在getInstance方法上加同步
 */
public class Singleton2 {

    private static Singleton2 instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton2() {
    }

    /**
     * 避免多线程出现问题，对getInstance方法加synchronized关键字。
     * 但是这样在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁。
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
