package com.summary.design.simplefactory.define1;

public class Client {
    public static void main(String[] args) {
        SimpleFactory.createProduct("A").doSomething();
        SimpleFactory.createProduct("B").doSomething();
    }
}
