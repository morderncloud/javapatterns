package io.bh.java.patterns.factorymethod;

public class CarClient {
	
	public static void main(String[] args) {
		CarFactory cf = new CarFactoryUS();
		cf.manufacture().startEngine();
		
		CarFactory cf2 = new CarFactoryChina();
		cf2.manufacture().startEngine();
	}

}
