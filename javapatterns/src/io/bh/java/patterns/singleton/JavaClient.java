package io.bh.java.patterns.singleton;

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
