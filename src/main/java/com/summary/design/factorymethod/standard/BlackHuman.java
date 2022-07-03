package com.summary.design.factorymethod.standard;

public class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑色");
    }

    @Override
    public void talk() {
        System.out.println("gu lu gu lu");
    }
}
