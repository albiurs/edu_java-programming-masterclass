package com.publicept.burger.ingredients;

public class Ingredient {

	private String name;
	private int amount;
	private double price;

	public Ingredient(String name) {

		switch (name.toLowerCase()) {
			case "lettuce":
				this.name = "lettuce";
				break;
			case "tomato":
				this.name = "tomato";
				break;
			case "carrot":
				this.name = "carrot";
				break;
			case "onion":
				this.name = "onion";
				break;
			case "cabbage":
				this.name = "cabbage";
				break;
			case "sweet pepper":
				this.name = "sweet pepper";
				break;
			case "none":
				this.name = "none";
				break;
			default:
				System.out.println("Wrong ingredient. Only lettuce, tomato, carrot, onion, cabbage, sweet pepper or none available.");
				break;
		}

		this.amount = 1;
		this.price = 0.5d;
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
