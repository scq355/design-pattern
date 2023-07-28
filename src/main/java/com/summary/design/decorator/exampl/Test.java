package com.summary.design.decorator.exampl;

public class Test {
    public static void main(String[] args) {
        System.out.println("===来一个基础版煎饼果子===");
        Battercake battercake = new BaseBattercake();
        System.out.println(battercake.getMessage() + "，总价格：" + battercake.getPrice() + "元。");

        System.out.println("===来一个套餐A煎饼果子===");
        battercake = new EggDecorator(battercake);
        System.out.println(battercake.getMessage() + "，总价格：" + battercake.getPrice() + "元。");

        System.out.println("===来一个套餐A+B煎饼果子===");
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMessage() + "，总价格：" + battercake.getPrice() + "元。");


        System.out.println("===屌丝买煎饼果子===");
        Battercake battercake2 = new BaseBattercake();
        battercake2 = new OtherDecorator(battercake2);
        System.out.println(battercake2.getMessage() + "，总价格：" + battercake2.getPrice() + "元。");
    }

}
