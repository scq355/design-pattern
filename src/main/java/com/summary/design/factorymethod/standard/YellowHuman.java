package com.summary.design.factorymethod.standard;

public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄色");
    }

    @Override
    public void talk() {
        System.out.println("讲话");
    }
}
