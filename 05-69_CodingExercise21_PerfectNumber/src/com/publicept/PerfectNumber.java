package com.publicept;

/**
 * PerfectNumber
 * A perfect number is a positive integer, which is equal to the sum of its proper positive divisors.
 *
 * isPerfectNumber (int number)
 */
public class PerfectNumber {

	/**
	 * isPerfectNumber ()
	 * Checks a number to be a perfect number.
	 * @param number number to be tested
	 * @return if it is a perfect number (= true), else (= false)
	 */
	public static boolean isPerfectNumber (int number) {
		if(number < 1) {
			return false;
		}

		int sum = 0;

		for(int i=1; i<number-1; i++) {

			if(number % i == 0) {
				sum += i;
				System.out.println(sum);
			}
		}

		return (sum == number) ? true : false;

	}
}
