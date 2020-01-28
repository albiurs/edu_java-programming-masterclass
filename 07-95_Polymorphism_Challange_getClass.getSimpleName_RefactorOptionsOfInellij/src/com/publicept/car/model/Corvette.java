package com.publicept.car.model;

import com.publicept.car.Car;

public class Corvette extends Car {

	private boolean rearSpoiler;

	public Corvette(int cylinders, String name) {
		super(cylinders, name);
		this.rearSpoiler = true;
	}

	/*
	 * getClass().getSimpleName()
	 * ...get the actual class name instead of hard-coded name
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

	public boolean isRearSpoiler() {
		System.out.print(getClass().getSimpleName() + ".isRearSpoiler() called: ");
		return rearSpoiler;
	}
}
