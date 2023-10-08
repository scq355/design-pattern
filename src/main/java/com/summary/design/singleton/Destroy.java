package com.summary.design.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class Destroy {
    @Test
    public void test() throws Exception {
        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);

        Singleton singleton = declaredConstructor.newInstance();
        System.out.println("反射=" + singleton);
        System.out.println("正常=" + Singleton.getInstance());
        System.out.println("正常=" + Singleton.getInstance());
    }

    @Test
    public void testUnsafe() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println("多线程=" + SingletonUnsafe.getInstance())).start();
        }
    }
}
