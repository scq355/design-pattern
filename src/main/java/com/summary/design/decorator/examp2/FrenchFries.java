package com.summary.design.decorator.examp2;

public class FrenchFries extends Decorator {
    public FrenchFries(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 薯条";
    }
}
