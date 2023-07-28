package com.summary.design.decorator.define;

public class DecoratorPattern {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("装饰之后");
        ConcreteDecorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}


interface Component {
    void operation();
}

class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("具体构建角色");
    }


    @Override
    public void operation() {
        System.out.println("具体构建的operation");
    }
}

// 抽象装饰器
class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构建角色增加额外的功能addFunction");
    }
}