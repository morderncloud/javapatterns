package io.bh.java.patterns.factorymethod;

import io.bh.java.patterns.simplefactory.CarProduct;

public abstract class CarFactory {
	public abstract CarProduct manufacture();
	
	public void testEngine() {
		CarProduct product = manufacture();
		product.startEngine();
	}

}
