package com.publicept.car;

public class Car {

	/**
	 * Polymorphism Challenge
	 */
	// We are going to go back to the car analogy.
	// Create a base class called Car
	// It should have a few fields that would be appropriate for a generic car class.
	// engine, cylinders, wheels, etc.
	// Constructor should initialize cylinders (number of) and name, and set wheels to 4
	// and engine to true. Cylinders and names would be passed parameters.
	//
	// Create appropriate getters
	//
	// Create some methods like startEngine, accelerate, and brake
	// show a message for each in the base class
	//
	// Now create 3 sub classes for your favorite vehicles.
	// Override the appropriate methods to demonstrate polymorphism in use.
	// put all classes in the one java file (this one).
	private boolean engine;
	private int cylinders;
	private int wheels;
	private String name;

	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.wheels = 4;
		this.name = name;
		this.engine = true;
	}

	/**
	 * getClass().getSimpleName()
	 * ...used to get the actual class name instead of hard-coded name
	 */
	public String startEngine() {
		return getClass().getSimpleName() + ".startEngine() called";
	}

	public String accelerate() {
		return getClass().getSimpleName() + ".accelerate() called";
	}

	public String brake() {
		return getClass().getSimpleName() + ".brake() called";
	}

	public String getName() {
		return getClass().getSimpleName() + " name: " + name;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}
}
