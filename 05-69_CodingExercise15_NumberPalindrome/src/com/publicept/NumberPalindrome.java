package com.publicept;

public class NumberPalindrome {

	public static boolean isPalindrome(int number) {

		int original = number;
		int reverse = 0;

		while (true) {

			reverse *= 10;
			reverse += (number % 10);
			number /= 10;
			//System.out.println("reverse: " + reverse);
			//System.out.println("number: " + number);


			if(number == 0) break;
		}
		//System.out.println(original);
		//System.out.println(reverse);
		return (original == reverse);

	}
}
