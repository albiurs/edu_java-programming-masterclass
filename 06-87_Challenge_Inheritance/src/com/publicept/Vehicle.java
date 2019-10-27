package com.publicept;

public class Vehicle {

	/**
	 * Challenge
	 */
	// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
	// Finally, create another class, a specific type of Car that inherits from the Car class.
	// You should be able to hand steering, changing gears, and moving (speed in other words).
	// You will want to decide where to put the appropriate state and behaviours (fields and methods).
	// As mentioned above, changing gears, increasing/decreasing speed should be included.
	// For you specific type of vehicle you will want to add something specific for that type of car.

	private int steer;
	private String steerType;
	private int gear;
	private int speed;
	private String color;


	/**
	 * Constructor 1
	 */
	public Vehicle() {
		this("no steer type yet", 1, "no color");
	}


	/**
	 * Constructor 2
	 * @param steerType
	 * @param gear
	 * @param color
	 */
	public Vehicle(String steerType, int gear, String color) {
		this.steer = 1;
		this.steerType = steerType;
		this.gear = gear;
		this.speed = 0;
		this.color = color;
	}


	/**
	 * steering the vehicle
	 * @param steeringDirection
	 */
	public void steeringDirection(String steeringDirection) {

		steeringDirection = steeringDirection.toLowerCase();

		switch (steeringDirection) {
			case "left":
				System.out.println("turn left");
			case "right":
				System.out.println("turn right");
			default:
				System.out.println("straight forward");

		}
	}


	/**
	 * Move
	 */
	public void move() {
		System.out.println("moving @ speed: " + getSpeed());
	}


	/**
	 * Getter and setter methods
	 * @return
	 */
	public int getSteer() {
		return steer;
	}

	public void setSteer(int steer) {
		this.steer = steer;
	}

	public String getSteerType() {
		return steerType;
	}

	public void setSteerType(String steerType) {
		this.steerType = steerType;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
