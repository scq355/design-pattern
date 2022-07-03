package com.summary.design.singleton.ext;

/**
 * @author scq
 */
public class Minister {
    public static void main(String[] args) {
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            System.out.print("minister" + i + "  ");
            Emperor.getInstance().say();
        }
    }
}
