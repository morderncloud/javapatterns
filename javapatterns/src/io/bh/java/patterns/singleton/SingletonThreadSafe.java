package io.bh.java.patterns.singleton;

public class SingletonThreadSafe {

	private volatile static SingletonThreadSafe s = null;

	private SingletonThreadSafe() {

	}

	public void sayHello() {
		System.out.println("Hello!");
	}

	public static SingletonThreadSafe getInstance() {

		// Lazy mode
		if (s == null) {
			synchronized (SingletonThreadSafe.class) {
				if (s == null) {
					s = new SingletonThreadSafe();
				}
			}

		}

		System.out.println("getInstance: " + s);
		return s;
	}

	public static void main(String[] args) {
		SingletonThreadSafe s = new SingletonThreadSafe();
		s.sayHello();

		System.out.println("main: " + s);

	}

}
