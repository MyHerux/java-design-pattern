package com.xu.design.Singleton.Singleton1;

/**
 * 双重检查锁定
 */
public class Singleton3 {

    private static Singleton3 instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton3() {
    }

    /**
     * synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，
     * 因为每次调用getInstance()，都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
