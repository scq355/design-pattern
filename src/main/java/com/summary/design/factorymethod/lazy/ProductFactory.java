package com.summary.design.factorymethod.lazy;

import com.summary.design.factorymethod.def.ConcreteProduct1;
import com.summary.design.factorymethod.def.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载的工厂类
 */
public class ProductFactory {
    private static final Map<String, Product> preMap = new HashMap<>();

    public static synchronized Product createProduct(String tyoe) throws Exception {
        Product product;
        if (preMap.containsKey(tyoe)) {
            product = preMap.get(tyoe);
        } else {
            if (tyoe.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct1();
            }
            preMap.put(tyoe, product);
        }
        return product;
    }
}
