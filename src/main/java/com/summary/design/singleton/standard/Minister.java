package com.summary.design.singleton.standard;

/**
 * @author scq
 */
public class Minister {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Emperor.getInstance().say();
        }
    }
}
