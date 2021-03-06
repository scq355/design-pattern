package com.summary.design.strategy.base_4;

/**
 * Description:
 * Created by Sun Changqing on 2018/03/18/10:38
 */
public class CashRebate extends CashSuper {

    private Double moneyRate = 1.0;

    public CashRebate(Double moneyRate) {
        this.moneyRate = moneyRate;
    }

    @Override
    public Double acceptCash(Double money) {
        return moneyRate * money;
    }
}
