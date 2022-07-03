package com.summary.design.factorymethod.standard;

/**
 * @author scq
 */
public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}