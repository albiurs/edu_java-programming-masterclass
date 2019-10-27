package com.publicept;

public class Car extends Vehicle {

	/**
	 * Challenge
	 */
	// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
	// Finally, create another class, a specific type of Car that inherits from the Car class.
	// You should be able to hand steering, changing gears, and moving (speed in other words).
	// You will want to decide where to put the appropriate state and behaviours (fields and methods).
	// As mentioned above, changing gears, increasing/decreasing speed should be included.
	// For you specific type of vehicle you will want to add something specific for that type of car.

	private int wheel;
	private String brand;
	private int door;


	/**
	 * Constructor 1
	 */
	public Car() {
		this("steering wheel", 1, "no color", 4, "no brand", 3);
	}


	/**
	 * Constructor 2
	 *
	 * @param steerType
	 * @param gear
	 * @param color
	 */
	public Car(String steerType, int gear, String color, int wheel, String brand, int door) {
		super("steering wheel", gear, color);
		this.wheel = wheel;
		this.brand = brand;
		this.door = door;
	}


	/**
	 * Move
	 */
	@Override
	public void move() {
		System.out.println("driving @ speed: " + getSpeed());
	}

	/**
	 * Getter and setter methods
	 * @return
	 */
	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
}
