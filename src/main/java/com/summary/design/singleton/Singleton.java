package com.summary.design.singleton;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    // 限制多个对象
    private Singleton() {

    }

    // 获得实例对象
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // 其他方法，尽量static
    public static void doSomething() {

    }
}
