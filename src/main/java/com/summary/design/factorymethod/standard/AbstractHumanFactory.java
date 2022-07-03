package com.summary.design.factorymethod.standard;

public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
