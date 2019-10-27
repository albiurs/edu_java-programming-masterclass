package com.publicept;

public class FirstLastDigitSum {

	public static int sumFirstAndLastDigit(int number) {

		if (number < 0) return -1;

		int mostSignificantNumber;
		int leastSignificantNumber = number % 10;

		while (number >= 10) {
			number /= 10;
		}
		mostSignificantNumber = number;

		return mostSignificantNumber + leastSignificantNumber;

	}
}
