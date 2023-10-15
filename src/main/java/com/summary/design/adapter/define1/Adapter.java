package com.summary.design.adapter.define1;

public class Adapter extends Adaptee implements Target {
    /**
     * 采用继承的方式实现转换功能
     */
    @Override
    public void request() {
        this.specificRequest();
    }
}
