package com.publicept;

public class SpecificCar extends Car {

	/**
	 * Challenge
	 */
	// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
	// Finally, create another class, a specific type of Car that inherits from the Car class.
	// You should be able to hand steering, changing gears, and moving (speed in other words).
	// You will want to decide where to put the appropriate state and behaviours (fields and methods).
	// As mentioned above, changing gears, increasing/decreasing speed should be included.
	// For you specific type of vehicle you will want to add something specific for that type of car.

	private int loadArea;
	private String carCategory;


	/**
	 * Constructor 1
	 */
	public SpecificCar() {
		this("steering wheel", 5, "no color yet", 4, "no brand yet", 2, 1);
	}


	/**
	 * Constructor 2
	 *
	 * @param steerType
	 * @param gear
	 * @param color
	 * @param wheel
	 * @param brand
	 * @param door
	 */
	public SpecificCar(String steerType, int gear, String color, int wheel, String brand, int door, int loadArea) {
		super(steerType, gear, color, wheel, brand, door);
		this.loadArea = loadArea;
		this.carCategory = "Truck";
	}


	/**
	 * Move
	 */
	@Override
	public void move() {
		System.out.println("tuck-tucking @ speed: " + getSpeed());
	}

	/**
	 * getters and setters
	 * @return
	 */
	public int getLoadArea() {
		return loadArea;
	}

	public void setLoadArea(int loadArea) {
		this.loadArea = loadArea;
	}

	public String getCarCategory() {
		return carCategory;
	}

	public void setCarCategory(String carCategory) {
		this.carCategory = carCategory;
	}
}
