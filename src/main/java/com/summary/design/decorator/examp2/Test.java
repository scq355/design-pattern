package com.summary.design.decorator.examp2;

public class Test {
    public static void main(String[] args) {
        BasicSet food = new BasicSet();
        Decorator setA = new FrenchFries(food);
        setA = new FriedChicken(setA);
        setA = new IceCream(setA);
        System.out.println("套餐A：" + setA.getDescription());
    }
}
