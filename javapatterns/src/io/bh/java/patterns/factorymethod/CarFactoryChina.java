package io.bh.java.patterns.factorymethod;

import io.bh.java.patterns.simplefactory.CarProduct;

public class CarFactoryChina extends CarFactory{

	@Override
	public CarProduct manufacture() {
		
		return new CarChina();
	}

}
