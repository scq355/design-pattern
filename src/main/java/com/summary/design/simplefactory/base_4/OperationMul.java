package com.summary.design.simplefactory.base_4;

/**
 * Created by scq on 2018-02-26 10:27:32
 */
public class OperationMul extends Operation {
	@Override
	public double getResult() {
		return this.getNumberA() * this.getNumberB();
	}
}
