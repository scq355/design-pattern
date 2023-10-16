package com.summary.design.builder.examp2;

import lombok.Data;

@Data
public class ComputerDIY {

    private String CPU;
    private String mainboard;
    private String memory;
    private String SSD;
    private String power;
    private String computerCase;

    public ComputerDIY(ComputerBuilder computerBuilder) {
        this.CPU = computerBuilder.CPU;
        this.mainboard = computerBuilder.mainboard;
        this.memory = computerBuilder.memory;
        this.SSD = computerBuilder.SSD;
        this.power = computerBuilder.power;
        this.computerCase = computerBuilder.computerCase;
    }

    public static class ComputerBuilder{
        private String CPU;
        private String mainboard;
        private String memory;
        private String SSD;
        private String power;
        private String computerCase;

        public ComputerBuilder buildCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder buildMainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public ComputerBuilder buildMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public ComputerBuilder buildSSD(String SSD) {
            this.SSD = SSD;
            return this;
        }

        public ComputerBuilder buildPower(String power) {
            this.power = power;
            return this;
        }

        public ComputerBuilder buildComputerCase(String computerCase) {
            this.computerCase = computerCase;
            return this;
        }


        public ComputerDIY build() {
            return new ComputerDIY(this);
        }
    }
}
