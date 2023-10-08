package com.summary.design.singleton;

public class SingletonSafe {
    private static SingletonSafe singleton = null;

    // 限制多个对象
    private SingletonSafe() {

    }

    // 懒汉式
    public static synchronized SingletonSafe getSingleton() {
        // thread2
        if (singleton == null) {
            // thread1
            singleton = new SingletonSafe();
        }
        return singleton;
    }
}
