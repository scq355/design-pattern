package com.summary.design.singleton;

public class SingletonDoubleCheck {
    // 禁止重排序
    private static volatile SingletonDoubleCheck instance;

    // 限制多个对象
    private SingletonDoubleCheck() {
    }

    // 获得实例对象
    public static SingletonDoubleCheck getSingleton() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    /**
                     * 不具有原子性，存在指令重排序
                     * 1.SingletonDoubleCheck分配内存
                     * 2.调构造函数，初始化成员变量
                     * 3.instance对象指向分配的内存空间
                     */
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
