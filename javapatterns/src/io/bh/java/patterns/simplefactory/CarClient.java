package io.bh.java.patterns.simplefactory;

public class CarClient {
	
	public static void main(String[] args) {
		
		CarProduct mySedan = CarFactory.createCar(1);
		CarProduct mySUV = CarFactory.createCar(2);
		
	}
	

}
