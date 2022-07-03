package com.summary.design.factorymethod.multi;

import com.summary.design.factorymethod.standard.BlackHuman;
import com.summary.design.factorymethod.standard.Human;

public class BlackHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
