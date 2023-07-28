package com.summary.design.decorator.exampl;

public class OtherDecorator extends BattercakeDecorator{
    public OtherDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMessage() {
        return message();
    }

    @Override
    protected int getPrice() {
        return price();
    }

    // 可以加其特有的功能方法
    private String message(){
        return "老板，啥也不要，来根大葱";
    }
    private int price(){
        return 5;
    }

    @Override
    protected void addedFunction() {

    }
}
