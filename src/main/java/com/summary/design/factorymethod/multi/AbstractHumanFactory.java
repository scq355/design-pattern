package com.summary.design.factorymethod.multi;

import com.summary.design.factorymethod.standard.Human;

/**
 * 多工厂
 * @author scq
 */
public abstract class AbstractHumanFactory {
    public abstract Human createHuman();
}
