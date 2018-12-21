package com.summary.design.simplefactory;

import com.summary.design.simplefactory.base_4.Operation;
import com.summary.design.simplefactory.base_4.OperationFactory;
import org.junit.Test;

/**
 * @Description : 简单工厂模式
 * Created by scq on 2018-02-26 10:32:19
 */
public class SimpleFactoryTest {
	@Test
	public void testFactory() {
		Operation operation = OperationFactory.createOperation("+");
		operation.setNumberA(4.0);
		operation.setNumberB(0.4);
		System.out.printf(operation.getResult() + "");
	}
}
