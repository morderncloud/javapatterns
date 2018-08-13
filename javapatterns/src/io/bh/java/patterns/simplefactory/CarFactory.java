package io.bh.java.patterns.simplefactory;

public class CarFactory {

	public static CarProduct createCar(int type) {
		CarProduct cp = null;
		if (type == 1) {
			cp = new CarSedan();

		} else if (type == 2) {
			cp = new CarSUV();

		}

		return cp;
	}

}
