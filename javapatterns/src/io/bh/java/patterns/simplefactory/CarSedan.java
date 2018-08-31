package io.bh.java.patterns.simplefactory;

public class CarSedan implements CarProduct{
	
	public CarSedan() {
		System.out.println("Creating CarSedan");
	}

	@Override
	public void startEngine() {
		System.out.println(CarSedan.class.getName() + " engine started");
	}

}
