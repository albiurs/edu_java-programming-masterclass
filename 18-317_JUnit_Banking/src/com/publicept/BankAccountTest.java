package com.publicept;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

	private BankAccount bankAccount;
	private static int count = 0;

	@org.junit.jupiter.api.BeforeAll
	public static void beforeAll() {
		System.out.println("This code executes before any test cases. Count = " + count++);
	}

	@org.junit.jupiter.api.AfterAll
	public static void afterAll() {
		System.out.println("This code executes after any test cases = " + count++);
	}

	@org.junit.jupiter.api.BeforeEach
	public void setUp() {
		bankAccount = new BankAccount("Urs", "Albisser", 1000.00, BankAccount.CHECKING);
		System.out.println("Running a test...");
	}

	@org.junit.jupiter.api.AfterEach
	public void tearDown() {
		System.out.println("End of test... Count = " + count++);
	}

	@org.junit.jupiter.api.Test
	public void deposit() {
		//fail("This test has yet to be implemented");
		double balance = bankAccount.deposit(200.00, true);
		assertEquals(1200.00, balance, 0);
	}

	@org.junit.jupiter.api.Test
	public void withdraw_branch() {
		//fail("This test has yet to be implemented");
		double balance = bankAccount.withdraw(600.00, true);
		assertEquals(400.00, balance,0);
	}

	/**
	 * assertThrows() test
	 */
	@org.junit.jupiter.api.Test
	public void withdraw_notBranch() {

		assertThrows(IllegalArgumentException.class, () -> {
			bankAccount.withdraw(600.00, false);
			fail("Should have thrown an IllegalArgument");
		});
	}

	/**
	 * JUnit 3 example assertThrows() test (same test as above)
	 */
	@org.junit.jupiter.api.Test
	public void withdraw_notBranch_jUnit3() {

		try {
			bankAccount.withdraw(600.00, false);
			fail("Should have thrown an IllegalArgument");
		} catch (IllegalArgumentException e) {
			// no processing needed because exception is caught
		}

	}

	@org.junit.jupiter.api.Test
	public void getBalance_deposit() {
		//fail("This test has yet to be implemented");
		bankAccount.deposit(200.00, true);
		assertEquals(1200.00, bankAccount.getBalance(), 0);
	}

	@org.junit.jupiter.api.Test
	public void getBalance_withdraw() {
		//fail("This test has yet to be implemented");
		bankAccount.withdraw(200.00, true);
		assertEquals(800.00, bankAccount.getBalance(), 0);
	}

	@org.junit.jupiter.api.Test
	public void isChecking_true() {
		assertTrue(bankAccount.isChecking(), "The account is not a checking account");
	}


	/**
	 * silly hardcoded dummy test for demonstration purpose
 	 */
	@org.junit.jupiter.api.Test
	public void dummyTest() {
		assertEquals(20, 20);
	}

	/**
	 * Dummy assertThrows() test method
	 */
	@org.junit.jupiter.api.Test
	public void whenExceptionThrown_thenAssertionSucceeds() {
		String test = null;
		assertThrows(NullPointerException.class, () -> {
			test.length();
		});
	}

	/**
	 * Dummy derived assertThrows() test method
	 */
	@org.junit.jupiter.api.Test
	public void whenDerivedExceptionThrown_thenAssertionSucceds() {
		String test = null;
		assertThrows(RuntimeException.class, () -> {
			test.length();
		});
	}
}