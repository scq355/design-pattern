package com.summary.design.factorymethod.multi;

import com.summary.design.factorymethod.standard.Human;

public class NvWa {
    public static void main(String[] args) {
        Human yellowHuman = new YellowHumanFactory().createHuman();
        Human blackHuman = new BlackHumanFactory().createHuman();
        Human whiteHuman = new WhiteHumanFactory().createHuman();

        yellowHuman.getColor();
        yellowHuman.talk();
        whiteHuman.getColor();
        whiteHuman.talk();
        blackHuman.getColor();
        blackHuman.talk();
    }
}
