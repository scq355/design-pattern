package com.summary.design.decorator.examp2;

public abstract class Decorator implements Food {
    private Food food;

    public Decorator(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return this.food.getDescription();
    }

}
