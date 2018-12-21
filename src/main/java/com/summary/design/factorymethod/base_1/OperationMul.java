package com.summary.design.factorymethod.base_1;

/**
 * Created by scq on 2018-03-22 15:56:17
 */
public class OperationMul extends Operation {
	@Override
	public Double getResult() {
		Double result = this.getNumberA() * this.getNumberB();
		return result;
	}
}
