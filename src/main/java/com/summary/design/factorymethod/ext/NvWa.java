package com.summary.design.factorymethod.ext;

import com.summary.design.factorymethod.standard.BlackHuman;
import com.summary.design.factorymethod.standard.WhiteHuman;
import com.summary.design.factorymethod.standard.YellowHuman;

public class NvWa {
    public static void main(String[] args) {
        YellowHuman yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        WhiteHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        BlackHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);

        yellowHuman.getColor();
        yellowHuman.talk();
        whiteHuman.getColor();
        whiteHuman.talk();
        blackHuman.getColor();
        blackHuman.talk();
    }
}
