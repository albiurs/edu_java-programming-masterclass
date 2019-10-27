package com.publicept.car.model;

import com.publicept.car.Car;

public class Ford extends Car {

	private boolean trunk;

	public Ford(int cylinders, String name, boolean trunk) {
		super(cylinders, name);
		this.trunk = trunk;
	}

	/**
	 * getClass().getSimpleName()
	 * ...used to get the actual class name instead of hard-coded name
	 */
	@Override
	public String startEngine() {
		return getClass().getSimpleName() + ".startEngine() called";

	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() + ".accelerate() called";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() + ".brake() called";
	}

	public boolean isTrunk() {
		System.out.print(getClass().getSimpleName() + ".isTrunk() called: ");
		return trunk;
	}
}
