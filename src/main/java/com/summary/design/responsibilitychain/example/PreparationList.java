package com.summary.design.responsibilitychain.example;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PreparationList {
    /**
     * 是否洗脸
     */
    private boolean washFace;

    /**
     * 是否洗头
     */
    private boolean washHair;

    /**
     * 是否吃早餐
     */
    private boolean haveBreakfast;

}
