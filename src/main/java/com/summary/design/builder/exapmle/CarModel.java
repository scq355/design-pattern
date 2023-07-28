package com.summary.design.builder.exapmle;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final void run() {
        for (String actionName : sequence) {
            if (actionName.equalsIgnoreCase("start")) {
                this.start(); //启动汽车
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop(); //停止汽车
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm(); //喇叭开始叫了
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                //如果是engine boom关键
                this.engineBoom(); //引擎开始轰鸣
            }
        }
    }

    public final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
