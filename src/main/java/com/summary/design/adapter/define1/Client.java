package com.summary.design.adapter.define1;

public class Client {
    public static void main(String[] args) {
        Target newPlug = new Adapter();
        // 对于使用者来说，它只需要知道适配器提供了一个两孔插头即可
        newPlug.request();
    }
}
