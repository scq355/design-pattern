package com.summary.design.decorator.examp2;

public class IceCream extends Decorator{
    public IceCream(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 冰淇淋";
    }
}
