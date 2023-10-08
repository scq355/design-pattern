package com.summary.design.singleton;

public class SingletonUnsafe {
    private static SingletonUnsafe INSTANCE = null;

    // 限制多个对象
    private SingletonUnsafe() {

    }

    // 线程安全问题
    public static SingletonUnsafe getInstance() {
        // thread2
        if (INSTANCE == null) {
            // thread1
            INSTANCE = new SingletonUnsafe();
        }
        return INSTANCE;
    }
}
