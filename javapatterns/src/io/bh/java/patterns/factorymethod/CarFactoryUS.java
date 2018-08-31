package io.bh.java.patterns.factorymethod;

import io.bh.java.patterns.simplefactory.CarProduct;

public class CarFactoryUS extends CarFactory{

	@Override
	public CarProduct manufacture() {
		
		return new CarUS();
	}

}
