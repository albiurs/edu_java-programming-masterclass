package com.publicept.car.model;

import com.publicept.car.Car;

public class Mitsubishi extends Car {

	private boolean loadArea;

	public Mitsubishi(int cylinders, String name, boolean loadArea) {
		super(cylinders, name);
		this.loadArea = loadArea;
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

	public boolean isLoadArea() {
		System.out.print(getClass().getSimpleName() + ".isLoadArea() called: ");
		return loadArea;
	}
}
