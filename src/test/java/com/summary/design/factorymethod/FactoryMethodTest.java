package com.summary.design.factorymethod;

import com.summary.design.factorymethod.base_1.AddFactory;
import com.summary.design.factorymethod.base_1.IFactory;
import com.summary.design.factorymethod.base_1.Operation;
import org.junit.Test;

/**
 * 工厂方法实测
 * Created by scq on 2018-03-22 16:08:56
 */
public class FactoryMethodTest {

	@Test
	public void testFactoryMethod() {
		IFactory operFactory = new AddFactory();
		Operation operation = operFactory.createOperation();
		operation.setNumberA(12.3);
		operation.setNumberB(23.4);
		Double result = operation.getResult();
		System.out.println(result);
	}
}
