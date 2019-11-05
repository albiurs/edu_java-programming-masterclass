package com.publicept;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe", "Sausage & Bacon", 11.53, "White");
		super.addHamburgerAddition1("Chips", 4.75);
		super.addHamburgerAddition2("Drink", 3.56);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Cannot add additional items to a deluxe burger");
	}
}
