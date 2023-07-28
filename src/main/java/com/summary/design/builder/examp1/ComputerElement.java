package com.summary.design.builder.examp1;

import lombok.Data;

/**
 * 计算机元件
 */
@Data
public class ComputerElement {
    private String CPU;
    private String mainboard;
    private String memory;
    private String SSD;
    private String power;
    private String computerCase;

    public ComputerElement() {
    }

    public ComputerElement(String CPU, String mainboard, String memory, String SSD, String power, String computerCase) {
        this.CPU = CPU;
        this.mainboard = mainboard;
        this.memory = memory;
        this.SSD = SSD;
        this.power = power;
        this.computerCase = computerCase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("电脑组装元件如下：\n");
        sb.append("CPU：")
                .append(CPU).append('\n');
        sb.append("主板:")
                .append(mainboard).append('\n');
        sb.append("内存：")
                .append(memory).append('\n');
        sb.append("SSD：")
                .append(SSD).append('\n');
        sb.append("电源：")
                .append(power).append('\n');
        sb.append("机箱：")
                .append(computerCase).append('\n');
        sb.append("正在组装中...").append('\n');
        sb.append("组装完成！").append('\n');
        return sb.toString();
    }

}