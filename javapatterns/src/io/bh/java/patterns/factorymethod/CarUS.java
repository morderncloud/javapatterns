package io.bh.java.patterns.factorymethod;

import io.bh.java.patterns.simplefactory.CarProduct;

public class CarUS implements CarProduct{

	@Override
	public void startEngine() {
		System.out.println(CarUS.class.getName() + " engine started");
		
	}

}
