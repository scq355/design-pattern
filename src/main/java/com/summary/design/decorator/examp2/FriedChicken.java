package com.summary.design.decorator.examp2;

public class FriedChicken extends Decorator{
    public FriedChicken(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + 炸鸡";
    }
}
