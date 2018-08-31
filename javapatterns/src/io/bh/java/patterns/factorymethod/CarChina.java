package io.bh.java.patterns.factorymethod;

import io.bh.java.patterns.simplefactory.CarProduct;

public class CarChina implements CarProduct{

	@Override
	public void startEngine() {
		System.out.println(CarChina.class.getName() + " engine started");
		
	}

}
