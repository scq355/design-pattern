package com.summary.design.factorymethod.standard;

public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("ba la ba la");
    }
}
