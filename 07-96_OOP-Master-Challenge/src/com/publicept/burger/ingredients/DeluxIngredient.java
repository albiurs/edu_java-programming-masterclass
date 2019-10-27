package com.publicept.burger.ingredients;

public class DeluxIngredient {

	private String name;
	private int amount;
	private double price;

	public DeluxIngredient(String name) {

		switch (name.toLowerCase()) {
			case "chips":
				this.name = "chips";
				break;
			case "drink":
				this.name = "drink";
				break;
			case "none":
				this.name = "none";
				break;
			default:
				System.out.println("Wrong ingredient. Only chips, drink or none available.");
				break;
		}

		this.amount = 1;
		this.price = 1.5d;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	public double getPrice() {
		return price;
	}
}
