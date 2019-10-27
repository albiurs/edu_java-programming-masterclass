package com.publicept;

public class EvenDigitSum {

	public static int getEvenDigitSum(int number) {

		if (number < 0) return -1;

		int sum = 0;
		int digit = 0;
		boolean isEven = false;

		while (number != 0) {

			digit = number % 10;
			isEven = (digit % 2 == 0);

			if (isEven) {
				sum += digit;
			}

			number /= 10;
		}

		return sum;
	}
}
