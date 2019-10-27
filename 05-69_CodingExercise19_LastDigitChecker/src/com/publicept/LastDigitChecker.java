package com.publicept;

public class LastDigitChecker {

	public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {

		//System.out.println("Test 1");

		if (isValid(numberOne) && isValid(numberTwo) && isValid(numberThree)) {

			numberOne = numberOne % 10;
			numberTwo = numberTwo % 10;
			numberThree = numberThree % 10;

			//System.out.println("test 2");
			//System.out.println(numberOne);
			//System.out.println(numberTwo);
			//System.out.println(numberThree);

			if (numberOne == numberTwo) return true;
			if (numberOne == numberThree) return true;
			if (numberTwo == numberThree) return true;
		}
		return false;
	}

	public static boolean isValid(int number) {
		return (number >= 10 && number <= 1000);
	}
}
