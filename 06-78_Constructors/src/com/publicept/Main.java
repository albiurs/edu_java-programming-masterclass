package com.publicept;

/**
 * Main
 *
 * main(String[] args)
 */
public class Main {

    public static void main(String[] args) {

        /*
         * Challenge 1: Bank Account
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
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(123456);
        System.out.println("Account number: " + bankAccount.getAccountNumber());

        bankAccount.setBalance(123.45d);
        System.out.println("Balance: " + bankAccount.getBalance());

        bankAccount.setCustomerName("Urs Albisser");
        System.out.println("Customer Name: " + bankAccount.getCustomerName());

        bankAccount.setEmail("mail@mail.com");
        System.out.println("Email: " + bankAccount.getEmail());

        bankAccount.setPhoneNumber("0791234567");
        System.out.println("Phone: " + bankAccount.getPhoneNumber());

        bankAccount.depositFund(1000.0d);

        bankAccount.withdraw(1500.0d);

        System.out.println();
        System.out.println("-----------------------");
        System.out.println();


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
        VipCustomer vipCustomer1 = new VipCustomer();
        VipCustomer vipCustomer2 = new VipCustomer("Bob", 1000.00d);
        VipCustomer vipCustomer3 = new VipCustomer("Joe", 5000.00d, "bob@bob.com");

        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmail());
        System.out.println();

        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmail());
        System.out.println();

        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getCreditLimit());
        System.out.println(vipCustomer3.getEmail());
        System.out.println();
    }
}
