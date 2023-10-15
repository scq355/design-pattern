package com.summary.design.simplefactory.define1;

public class SimpleFactory {
    public static Product createProduct(String productName) {
        Product instance = null;
        switch (productName) {
            case "A":
                instance = new ProductA();
                break;
            case "B":
                instance = new ProductB();
                break;
        }
        return instance;
    }
}
