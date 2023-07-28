package com.summary.design.builder.examp2;

public class Test {
    public static void main(String[] args) {
        ComputerDIY computerDIY = new ComputerDIY.ComputerBuilder()
                .buildCPU("Intel酷睿六核处理器i5-8400")
                .buildMainboard("Intel B360")
                .buildMemory("16G")
                .buildSSD("16G")
                .buildPower("美商海盗船")
                .buildComputerCase("普通机箱")
                .build();
        System.out.println(computerDIY.diy());
    }
}