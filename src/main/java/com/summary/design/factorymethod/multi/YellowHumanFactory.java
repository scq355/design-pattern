package com.summary.design.factorymethod.multi;

import com.summary.design.factorymethod.standard.Human;
import com.summary.design.factorymethod.standard.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
