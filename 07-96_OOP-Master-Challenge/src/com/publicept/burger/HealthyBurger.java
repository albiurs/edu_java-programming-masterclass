package com.publicept.burger;

import com.publicept.burger.ingredients.Ingredient;

public class HealthyBurger extends Burger {

	/**
	 * OOP Master Challenge
	 */
	// Also create two extra varieties of Hamburgers (subclasses) to cater for
	// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
	// The healthy burger can have 6 items (Additions) in total.
	// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
	// not the base class (Hamburger), since the two additions are only appropriate for this new class
	// (in other words new burger type).

	private Ingredient additionFive;
	private Ingredient additionSix;

	public HealthyBurger(String breadRollType, String meat) {
		super(breadRollType, meat);
		this.additionFive = null;
		this.additionSix = null;
	}

	public void pickAdditions(String additionOne, String additionTwo, String additionThree, String additionFour,
							  String additionFive, String additionSix) {
		super.setAdditionOne(getIngredient(additionOne));
		super.setAdditionTwo(getIngredient(additionTwo));
		super.setAdditionThree(getIngredient(additionThree));
		super.setAdditionFour(getIngredient(additionFour));

		this.additionFive = getIngredient(additionFive);
		this.additionSix = getIngredient(additionSix);

		super.calculateFullPrice();
	}

	@Override
	public void printAdditions() {
		System.out.println("Additions chosen: " + super.getAdditionOne().getName() + ", " + super.getAdditionTwo().getName() + ", "
				+ super.getAdditionThree().getName() + ", " + super.getAdditionFour().getName() + additionFive.getName() + ", " + additionSix.getName() + ".");
	}
}
