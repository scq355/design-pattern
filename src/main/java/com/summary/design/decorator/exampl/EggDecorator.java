package com.summary.design.decorator.exampl;

public class EggDecorator extends BattercakeDecorator{
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }


    @Override
    protected String getMessage() {
        return super.getMessage() + " + 1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    protected void addedFunction() {

    }
}
