package com.summary.design.builder.exapmle;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        normalBuilder();

        director();
    }

    /**
     * 普通建造者
     */
    private static void normalBuilder() {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmwCarModel = (BMWModel) bmwBuilder.getCarModel();
        bmwCarModel.run();
    }

    /**
     * 封装建造者
     */
    private static void director() {
        Director director = new Director();
        for (int i = 0; i < 1000; i++) {
            director.getABenzModel();
        }

        for (int i = 0; i < 1000; i++) {
            director.getBBenzModel();
        }

        for (int i = 0; i < 1000; i++) {
            director.getCBMWModel();
        }
    }
}
