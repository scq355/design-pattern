package com.summary.design.abstractfactory.base;

public class MaleFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleYellowHuman();
    }
}
