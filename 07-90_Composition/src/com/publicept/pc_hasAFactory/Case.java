package com.publicept.pc_hasAFactory;

/**
 * Case
 * Case(String model, String manufacturer, String powerSupply, Dimensions dimensions)
 *
 * pressPowerButton()
 * getModel()
 * getManufacturer()
 * getPowerSupply()
 * getDimensions()
 */
public class Case {



	// == fields ==
	private String model;
	private String manufacturer;
	private String powerSupply;
	/*
	 * Composition:
	 * -> hasA relationship!
	 */
	private Dimensions dimensions;



	// == constructors ==
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}



	// == public methods ==
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}



	// == getters ==
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
}
