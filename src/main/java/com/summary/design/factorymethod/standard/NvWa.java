package com.summary.design.factorymethod.standard;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);

        yellowHuman.getColor();
        yellowHuman.talk();
        whiteHuman.getColor();
        whiteHuman.talk();
        blackHuman.getColor();
        blackHuman.talk();
    }
}
