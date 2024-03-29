package com.summary.design.adapter.base_1;

/**
 * Created by scq on 2018-03-27 14:06:43
 */
public class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter() {
		this.adaptee = new Adaptee();
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
