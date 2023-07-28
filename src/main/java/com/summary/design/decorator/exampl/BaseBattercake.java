package com.summary.design.decorator.exampl;

public class BaseBattercake extends Battercake{
    @Override
    protected String getMessage() {
        return "煎饼果子";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
