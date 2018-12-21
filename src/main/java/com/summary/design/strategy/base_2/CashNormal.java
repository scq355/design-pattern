package com.summary.design.strategy.base_2;

/**
 * Description:
 * Created by Sun Changqing on 2018/03/18/10:37
 */
public class CashNormal extends CashSuper {
    @Override
    public Double acceptCash(Double money) {
        return money;
    }
}
