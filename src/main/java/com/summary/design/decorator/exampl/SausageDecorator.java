package com.summary.design.decorator.exampl;

public class SausageDecorator extends BattercakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMessage() {
        return super.getMessage()  + " + 一个香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 4;
    }

    @Override
    protected void addedFunction() {

    }
}
