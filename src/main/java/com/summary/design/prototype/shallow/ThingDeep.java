package com.summary.design.prototype.shallow;

import java.util.ArrayList;

public class ThingDeep implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected ThingDeep clone() {
        ThingDeep thing = null;
        try {
            thing = (ThingDeep)super.clone();
            thing.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    // 设置HashMap的值
    public void setValue(String value){
        this.arrayList.add(value);
    }
    // 取得arrayList的值
    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
