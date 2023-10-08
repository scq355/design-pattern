package com.summary.design.singleton;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonAtomicReference {
    private static final AtomicReference<SingletonAtomicReference> INSTANCE = new AtomicReference<>();
    private static SingletonAtomicReference instance;

    // 限制多个对象
    private SingletonAtomicReference() {

    }

    // 获得实例对象
    public static SingletonAtomicReference getSingleton() {
        for (;;) {
            instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new SingletonAtomicReference());
            return INSTANCE.get();
        }
    }

    // 其他方法，尽量static
    public static void doSomething() {

    }


}
