package com.publicept.burger;

import com.publicept.burger.ingredients.DeluxIngredient;
import com.publicept.burger.ingredients.Ingredient;

public class DeluxBurger extends Burger {

	/**
	 * OOP Master Challenge
	 */
	// Also create two extra varieties of Hamburgers (subclasses) to cater for
	// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
	// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
	// object is created, and then prevent other additions being made.
	private DeluxIngredient chips;
	private DeluxIngredient drink;

	public DeluxBurger(String breadRollType, String meat) {
		super(breadRollType, meat);
		this.chips = null;
		this.drink = null;
	}

	public void pickAdditions(String additionOne, String additionTwo, String additionThree, String additionFour) {
		super.setAdditionOne(getIngredient(additionOne));
		super.setAdditionTwo(getIngredient(additionTwo));
		super.setAdditionThree(getIngredient(additionThree));
		super.setAdditionFour(getIngredient(additionFour));

		this.chips = getDeluxIngredient("chips");
		this.drink = getDeluxIngredient("drink");

		printAdditions();
	}

	@Override
	public void printAdditions() {
		System.out.println("Additions chosen: " + super.getAdditionOne().getName() + ", " + super.getAdditionTwo().getName() + ", "
				+ super.getAdditionThree().getName() + ", " + super.getAdditionFour().getName() + ", " + chips.getName() + ", " + drink.getName() + ".");
	}

	protected DeluxIngredient getDeluxIngredient(String DeluxIngredientName) {

		DeluxIngredient deluxIngredient = new DeluxIngredient(DeluxIngredientName);

		if(DeluxIngredientName != "none") {
			super.setAdditions(super.getAdditions() + 1);
			super.setAdditionsPrice(super.getAdditionsPrice() + deluxIngredient.getPrice());
		}

		return deluxIngredient;
	}
}
