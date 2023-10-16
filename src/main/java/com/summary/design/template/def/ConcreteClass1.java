package com.summary.design.template.def;

public class ConcreteClass1 extends AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("具体实现doSomething1");
    }

    @Override
    protected void doAnything() {
        System.out.println("具体实现doAnything1");
    }
}
