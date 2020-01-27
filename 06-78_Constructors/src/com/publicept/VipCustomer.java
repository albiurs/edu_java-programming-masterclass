package com.publicept;

/**
 * VipCustomer
 *
 * VipCustomer()
 * VipCustomer(String name, double creditLimit)
 * VipCustomer(String name, double creditLimit, String email)
 *
 * getName()
 * getCreditLimit()
 * getEmail()
 */
public class VipCustomer {

	/*
	 * Challenge 2: VIP Customer
	 */
	// Create a new class VipCustomer
	// it should have 3 fields name, credit limit, and email address.
	// create 3 constructors
	// 1st constructor empty should call the constructor with 3 parameters with default values
	// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
	// 3rd constructor should save all fields.
	// create getters only for this using code generation of intellij as setters wont be needed
	// test and confirm it works.



	// == fields ==
	private String name;
	private double creditLimit;
	private String email;



	// == constructors ==
	/**
	 * VipCustomer()
	 * Empty, default value constructor
	 */
	public VipCustomer() {
		this("Name Example", 0.00d, "name.example@mail.com");
	}


	/**
	 * VipCustomer()
	 * VipCustomer(String name, double creditLimit)
	 * Special constructor with 2 params
	 * @param name
	 * @param creditLimit
	 */
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "no email");
	}


	/**
	 * VipCustomer()
	 * Main Constructor
	 * @param name
	 * @param creditLimit
	 * @param email
	 */
	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}



	// == getters ==
	/**
	 * getName()
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * getCreditLimit()
	 * @return credit limit
	 */
	public double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * getEmail()
	 * @return email address
	 */
	public String getEmail() {
		return email;
	}
}