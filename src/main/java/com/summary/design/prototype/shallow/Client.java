package com.summary.design.prototype.shallow;

public class Client {
    public static void main(String[] args) {
        shallow();
        deep();
    }

    private static void shallow() {
        // 产生一个对象
        ThingShallow thing = new ThingShallow();
        // 设置一个值
        thing.setValue("张三");

        ThingShallow cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }

    private static void deep() {
        ThingDeep thing = new ThingDeep();
        // 设置一个值
        thing.setValue("张三");

        ThingDeep cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }


}
