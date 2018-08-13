package io.bh.java.basics;

public abstract class AbstractClass {
	
	public abstract void cleanAir();
	
	public void init() {
		System.out.println("Initializing..");
	}
	
	public static void main(String[] args) {
		// new AbstractClass().cleanAir(); // failed
	}

}
