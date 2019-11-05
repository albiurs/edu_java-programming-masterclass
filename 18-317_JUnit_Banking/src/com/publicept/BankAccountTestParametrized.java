package com.publicept;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(Parameterized.class)
public class BankAccountTestParametrized {

	private BankAccount bankAccount;
	private double amount;
	private boolean branch;
	private double expected;

//	public BankAccountTestParametrized(double amount, boolean branch, double expected) {
//		this.amount = amount;
//		this.branch = branch;
//		this.expected = expected;
//	}

	@org.junit.jupiter.api.BeforeEach
	public void setup() {
		bankAccount = new BankAccount("Urs", "Albisser", 1000.00, BankAccount.CHECKING);
		System.out.println("Running a Test...");
	}

	@org.junit.jupiter.api.AfterEach
	public void tearDown() {
		System.out.println("End of test...");
	}

//	@ParameterizedTest
//	@MethodSource("testConditions")
//	public static Collection<Object[]> testConditions() {
//		return Arrays.asList(new Object[][] {
//				{100.00, true, 1100.00},
//				{200.00, true, 12.00},
//				{325.14, true, 1325.14},
//				{489.33, true, 1489.33},
//				{1000.00, true, 2000.00}
//		});
//	}
//
//	@org.junit.jupiter.api.Test
//	public void deposit() {
//		//fail("This test has yet to be implemented");
//		bankAccount.deposit(amount, branch);
//		assertEquals(expected, bankAccount.getBalance(), 0);
//	}

	@ParameterizedTest
	@MethodSource("testConditions")
	public void deposit() {
		//fail("This test has yet to be implemented");
		bankAccount.deposit(amount, branch);
		assertEquals(expected, bankAccount.getBalance(), 0);
	}

	private static Stream<Arguments> testConditions() {
		return Stream.of(
				Arguments.of(100.00, true, 1100.00),
				Arguments.of(200.00, true, 12.00),
				Arguments.of(325.14, true, 1325.14),
				Arguments.of(489.33, true, 1489.33),
				Arguments.of(1000.00, true, 2000.00));
	}
}
