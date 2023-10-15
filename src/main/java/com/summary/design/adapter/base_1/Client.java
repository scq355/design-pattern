package com.summary.design.adapter.base_1;

/**
 * Created by scq on 2018-03-27 14:07:50
 */
public class Client {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
