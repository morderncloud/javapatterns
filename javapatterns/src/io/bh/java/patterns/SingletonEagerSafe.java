package io.bh.java.patterns;

public class SingletonEagerSafe {
	
	private static SingletonEagerSafe ses = new SingletonEagerSafe();
	
	private SingletonEagerSafe() {
		
	}
	
	public static SingletonEagerSafe getInstance() {
		return ses;
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		SingletonEagerSafe ses = SingletonEagerSafe.getInstance();
		ses.sayHello();
		
	}

}
