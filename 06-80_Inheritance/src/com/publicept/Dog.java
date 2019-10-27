package com.publicept;

/**
 * "extends" keyword: inherit from a super class (=parent-class)
 */
public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	/**
	 * Dog.Dog()
	 * @param name
	 * @param size
	 * @param weight
	 * @param eyes
	 * @param legs
	 * @param tail
	 * @param teeth
	 * @param coat
	 */
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		/* super() must be called first in the extended constructor! */
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	/**
	 * Dog.chew()
	 */
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	/**
	 * Dog.eat()
	 * -> Override
	 */
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}


	/**
	 * Dog.walk()
	 * -> move();
	 */
	public void walk() {
		System.out.println("Dog.walk() called -> move(5)");
		/**
		 * Generally, it's recommended to use move() instead of super.move():
		 * If the move()-function in the Dog-class is overridden at a later time,
		 * it's will correctly call that move() method.
		 * -> see walk() and run() examples below...
		 */
		move(5);
	}


//	/**
//	 * Dog.walk()
//	 * -> super.move();
//	 */
//	public void walk() {
//		System.out.println("Dog.walk() called -> super.move(5)");
//		super.move(5);
//	}


//	/**
//	 * Dog.run()
//	 * -> move();
//	 */
//	public void run() {
//		System.out.println("Dog.run() called -> move(10)");
//		move(10);
//	}


	/**
	 * Dog.run()
	 * -> super.move();
	 */
	public void run() {
		System.out.println("Dog.run() called -> super.move(10) -> move()-override is skipped!");
		super.move(10);
	}


	private void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}

	/**
	 * Dog.move()
	 * @param speed
	 */
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
}
