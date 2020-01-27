package com.publicept;

/**
 * BankAccount
 *
 * BankAccount()
 * BankAccount(int accountNumber, String customerName)
 * BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber)
 *
 * depositFund(double deposit)
 * withdraw(double withdraw)
 *
 * getAccountNumber()
 * setAccountNumber(int accountNumber)
 * getBalance()
 * setBalance(double balance)
 * getCustomerName()
 * setCustomerName(String customerName)
 * getEmail()
 * setEmail()
 * getPhoneNumber()
 * setPhoneNumber()
 */
public class BankAccount {

	/*
	 * Challenge: Bank Account
	 */
	// Create a new class for a bank account
	// Create fields for the account number, balance, customer name, email and phone number.
	//
	// Create getters and setters for each field
	// Create two additional methods
	// 1. To allow the customer to deposit funds (this should increment the balance field).
	// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
	// but not allow the withdrawal to complete if their are insufficient funds.
	// You will want to create various code in the Main class (the one created by IntelliJ) to
	// confirm your code is working.
	// Add some System.out.println's in the two methods above as well.

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;


	// == constructors ==
	/**
	 * Empty constructor
	 */
	public BankAccount() {
		// Call to this() must be the very first statement in the constructor body being executed!
		this(0, 0.00d, null, null, null);

		// direct initialization of variables is recommended for constructors to make sure,
		// the object is bing created.
//		this.accountNumber = 0;
//		this.balance = 0.00d;
//		this.customerName = null;
//		this.email = null;
//		this.phoneNumber = null;
	}


	/**
	 * Major constructor with all parameters
	 * @param accountNumber
	 * @param balance
	 * @param customerName
	 * @param email
	 * @param phoneNumber
	 */
	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	/**
	 * Sub-Constructor initializes only most required fields with and setting other fields to default values.
	 * @param accountNumber
	 * @param customerName
	 */
	public BankAccount(int accountNumber, String customerName) {
		// call the major constructor above, which actually updates the fields
		this(accountNumber, 0.00d, customerName, null, null);
	}


	// == public methods ==
	public void depositFund(double deposit) {
		this.balance += deposit;
		System.out.println("Deposit: " + deposit);
		System.out.println("New balance: " + getBalance());
	}


	public void withdraw(double withdraw) {
		if(withdraw <= this.balance) {
			this.balance -= withdraw;
			System.out.println("Withdraw: " + withdraw);
			System.out.println("New balance: " + getBalance());
		} else {
			System.out.println("Balance too small for withdraw.");
			System.out.println("Requeseted withdraw: " + withdraw);
			System.out.println("Current balance: " + getBalance());
		}
	}


	// == getters & setters ==
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
