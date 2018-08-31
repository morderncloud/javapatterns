package io.bh.java.patterns.simplefactory;

public class CarSUV implements CarProduct{
	
	public CarSUV() {
		System.out.println("Creating SUV");
	}

	@Override
	public void startEngine() {
		System.out.println(CarSUV.class.getName() + " engine started");
	}

}
