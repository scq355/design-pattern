package com.summary.design.bridge.base_1;

/**
 * Created by scq on 2018-03-26 11:37:44
 */
public class RefinedAbstraction extends Abstraction {
	@Override
	public void operation() {
		this.implementor.operation();
	}
}
