package com.summary.design.singleton.standard;

import java.util.Random;

/**
 * @author scq
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();

    private Emperor() {

    }

    public static Emperor getInstance(){
        return emperor;
    }

    public void say(){
        System.out.println("I'm Emperor");
    }
}
