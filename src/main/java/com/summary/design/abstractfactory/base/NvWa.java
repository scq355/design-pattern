package com.summary.design.abstractfactory.base;

public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();

        Human yellowHuman = maleFactory.createYellowHuman();
        yellowHuman.getSex();
        yellowHuman.talk();
        yellowHuman.getColor();
        Human femaleYellowHuman = femaleFactory.createYellowHuman();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();
        femaleYellowHuman.getColor();
    }
}
