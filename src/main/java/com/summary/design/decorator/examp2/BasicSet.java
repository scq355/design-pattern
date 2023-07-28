package com.summary.design.decorator.examp2;

public class BasicSet implements Food{
    @Override
    public String getDescription() {
        return "汉堡 + 可乐";
    }
}
