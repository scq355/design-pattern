package com.summary.design.proxy.def;

public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Object... objects) {

    }

    //预处理
    private void before() {
        //do something
    }

    //善后处理
    private void after() {
        //do something
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
}
