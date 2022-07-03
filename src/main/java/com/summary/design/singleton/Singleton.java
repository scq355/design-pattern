package com.summary.design.singleton;

public class Singleton {
    private static final Singleton  singleton = new Singleton();

    // 限制多个对象
    private Singleton() {

    }

    // 活得实例对象
    public static Singleton getSingleton() {
        return singleton;
    }

    public static void doSomething() {

    }


}
