package io.bh.java.patterns.singleton;

public class SingletonInnerStaticClass {
	
	private SingletonInnerStaticClass() {
		
	}
	
	
	private static class InnerStatic {
		private static final SingletonInnerStaticClass INSTANCE = new SingletonInnerStaticClass();
	}
	
	public SingletonInnerStaticClass getInstance() {
		return InnerStatic.INSTANCE;
	}

}
