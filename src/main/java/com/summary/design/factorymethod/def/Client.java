package com.summary.design.factorymethod.def;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();

        Product product1 = creator.createProduct(ConcreteProduct1.class);
        product1.method1();
        product1.method2();
    }
}
