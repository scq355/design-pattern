package com.summary.design.factorymethod.single;

import java.lang.reflect.Constructor;

public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class clazz = Class.forName(Singleton.class.getName());
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Singleton getSingleton() {
        return singleton;
    }
}
