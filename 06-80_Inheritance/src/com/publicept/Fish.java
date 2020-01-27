package com.publicept;

/**
 * Fish extends Animal
 * "extends" keyword: inherit from a super class (=parent-class)
 *
 */
public class Fish extends Animal {


	// == fields ==
	private int gills;
	private int eyes;
	private int fins;


	// == constructors ==
	public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
		/* super() must be called first in the extended constructor! */
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}



	// == override methods ==
	/**
	 * Dog.move()
	 * @param speed
	 */
	@Override
	public void move(int speed) {
		System.out.println("Fish.move() called");
		swim(speed);
	}



	// == public methods ==
	public void rest() {
		System.out.println("Fish.rest() called");
		super.move(0);
	}

	public void moveMuscles() {
		System.out.println("Fish.moveMuscles() called");
	}

	public void moveBackFin() {
		System.out.println("Fish.moveBackFin() called");
	}

	public void swim(int speed) {
		System.out.println("Fish.swim() called");
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
}
