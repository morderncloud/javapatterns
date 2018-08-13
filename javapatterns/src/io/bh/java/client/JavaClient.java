package io.bh.java.client;

import io.bh.java.patterns.SingletonEnum;
import io.bh.java.patterns.SingletonThreadSafe;

public class JavaClient {
	
	public static void main(String[] args) {
		
		SingletonThreadSafe s = SingletonThreadSafe.getInstance();
		// Singleton s = new Singleton(); // failed

		System.out.println(s);
		/*
		SingletonEnum.instance.doSomething();
		SingletonEnum.instance2.doSomething();
		*/
	}

}
