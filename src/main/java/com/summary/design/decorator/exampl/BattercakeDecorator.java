package com.summary.design.decorator.exampl;

public abstract class BattercakeDecorator extends Battercake{

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMessage() {
        return this.battercake.getMessage();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }

    protected abstract void addedFunction();
}
