package io.bh.java.patterns;

import io.bh.java.basics.MyInterface;

/*
$ javap SingletonEnum.class

Compiled from "SingletonEnum.java"
public abstract class io.bh.java.patterns.SingletonEnum extends java.lang.Enum<io.bh.java.patterns.SingletonEnum> implements io.bh.java.basics.MyInterface {
  public static final io.bh.java.patterns.SingletonEnum instance;
  public static final io.bh.java.patterns.SingletonEnum instance2;
  static {};
  public static io.bh.java.patterns.SingletonEnum[] values();
  public static io.bh.java.patterns.SingletonEnum valueOf(java.lang.String);
  io.bh.java.patterns.SingletonEnum(java.lang.String, int, io.bh.java.patterns.SingletonEnum);
}

 */
public enum SingletonEnum implements MyInterface {

	 instance {

		public int count = 1;

		@Override
		public void doSomething() {
			System.out.println("Doing something: " + count);

		}
	}, 
	
	instance2 {

		public int count = 2;

		@Override
		public void doSomething() {
			System.out.println("Doing something: " + count);

		}
	}
	

}
