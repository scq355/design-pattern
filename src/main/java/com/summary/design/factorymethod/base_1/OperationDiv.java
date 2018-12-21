package com.summary.design.factorymethod.base_1;

/**
 * Created by scq on 2018-03-22 15:57:01
 */
public class OperationDiv extends Operation {
	@Override
	public Double getResult() {
		Double result = null;
		try {
			 result = this.getNumberA() / this.getNumberB();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
