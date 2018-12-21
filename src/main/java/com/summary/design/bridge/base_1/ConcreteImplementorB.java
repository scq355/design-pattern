package com.summary.design.bridge.base_1;

/**
 * Created by scq on 2018-03-26 11:36:12
 */
public class ConcreteImplementorB extends Implementor {
	@Override
	public void operation() {
		System.out.println("具体实现B的方法执行");
	}
}
