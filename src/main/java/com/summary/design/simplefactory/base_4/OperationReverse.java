package com.summary.design.simplefactory.base_4;

/**
 * Created by scq on 2018-02-26 10:32:19
 */
public class OperationReverse extends Operation {
	@Override
	public double getResult() {
		return -this.getNumberB();
	}
}
