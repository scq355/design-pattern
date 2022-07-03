package com.summary.design.factorymethod.multi;

import com.summary.design.factorymethod.standard.Human;
import com.summary.design.factorymethod.standard.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
