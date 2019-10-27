package com.publicept.burger;

import com.publicept.burger.ingredients.Ingredient;

public class Burger {

	/**
	 * OOP Master Challenge
	 */
	// The basic hamburger should have the following items.
	// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
	// the customer can select to be added to the burger.
	// Each one of these items gets charged an additional price so you need some way to track how many items got added
	// and to calculate the final price (base burger with all the additions).
	// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
	// Create a Hamburger class to deal with all the above.
	// The constructor should only include the roll type, meat and price, can also include name of burger or you
	// can use a setter.

	private String name;
	private String breadRollType;
	private String meat;
	private int additions;
	private Ingredient additionOne;
	private Ingredient additionTwo;
	private Ingredient additionThree;
	private Ingredient additionFour;
	private double fullPrice;
	private double basePrice;
	private double additionsPrice;

	public Burger(String breadRollType, String meat) {
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.additions = 0;
		this.additionOne = null;
		this.additionTwo = null;
		this.additionThree = null;
		this.additionFour = null;
		this.basePrice = 6.0d;
	}

	public void pickAdditions(String additionOne, String additionTwo, String additionThree, String additionFour) {
		this.additionOne = getIngredient(additionOne);
		this.additionTwo = getIngredient(additionTwo);
		this.additionThree = getIngredient(additionThree);
		this.additionFour = getIngredient(additionFour);

		calculateFullPrice();
	}

	protected Ingredient getIngredient(String ingredientName) {

		Ingredient ingredient = new Ingredient(ingredientName);

		if(ingredientName != "none") {
			additions += 1;
			additionsPrice += ingredient.getPrice();
		}

		return ingredient;
	}

	public void printAdditions() {
		System.out.println("Additions chosen: " + additionOne.getName() + ", " + additionTwo.getName() + ", "
				+ additionThree.getName() + ", " + additionFour.getName() + ".");
	}

	protected double calculateFullPrice() {
		this.fullPrice = basePrice + additionsPrice;
		return this.fullPrice;
	}


	/**
	 * Getters 'n' setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreadRollType() {
		return breadRollType;
	}

	public void setBreadRollType(String breadRollType) {
		this.breadRollType = breadRollType;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public int getAdditions() {
		return additions;
	}

	public void setAdditions(int additions) {
		this.additions = additions;
	}

	public Ingredient getAdditionOne() {
		return additionOne;
	}

	public void setAdditionOne(Ingredient additionOne) {
		this.additionOne = additionOne;
	}

	public Ingredient getAdditionTwo() {
		return additionTwo;
	}

	public void setAdditionTwo(Ingredient additionTwo) {
		this.additionTwo = additionTwo;
	}

	public Ingredient getAdditionThree() {
		return additionThree;
	}

	public void setAdditionThree(Ingredient additionThree) {
		this.additionThree = additionThree;
	}

	public Ingredient getAdditionFour() {
		return additionFour;
	}

	public void setAdditionFour(Ingredient additionFour) {
		this.additionFour = additionFour;
	}

	public double getFullPrice() {
		return fullPrice;
	}

	public void setFullPrice(double fullPrice) {
		this.fullPrice = fullPrice;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getAdditionsPrice() {
		return additionsPrice;
	}

	public void setAdditionsPrice(double additionsPrice) {
		this.additionsPrice = additionsPrice;
	}
}
