package com.publicept;

public class NumberToWords {

	/**
	 * Print a number in words to the console in reverse order
	 * @param number
	 */
	public static void numberToWords(int number) {

		if(number < 0 ) {
			System.out.println("Invalid Value");
		}

		int reverseNumber = reverse(number);
		
		int digitCount = getDigitCount(number);
		int numberToParse = reverseNumber;

		String numberToParseString = "";

		while(numberToParse > 0) {

			int remainder = 0;

			remainder = numberToParse % 10;

			switch (remainder) {
				case 0:
					numberToParseString += "Zero ";
					break;
				case 1:
					numberToParseString += "One ";
					break;
				case 2:
					numberToParseString += "Two ";
					break;
				case 3:
					numberToParseString += "Three ";
					break;
				case 4:
					numberToParseString += "Four ";
					break;
				case 5:
					numberToParseString += "Five ";
					break;
				case 6:
					numberToParseString += "Six ";
					break;
				case 7:
					numberToParseString += "Seven ";
					break;
				case 8:
					numberToParseString += "Eight ";
					break;
				default:
					numberToParseString += "Nine ";
					break;
			}

			numberToParse = numberToParse / 10;
		}

		if(digitCount == 1 && reverseNumber == 0) {		// case of number == 0
			numberToParseString += "Zero ";
		} else {										// anything else
			while (digitCount > getDigitCount(reverseNumber)) {
				numberToParseString += "Zero ";
				digitCount--;
			}
		}

		
		System.out.println(numberToParseString);
	}


	/**
	 * reverse all digits in a number
	 * @param number
	 * @return
	 */
	public static int reverse(int number) {

		int reverseNumber = 0;

		while(number != 0) {

			int remainder = number % 10;
			reverseNumber *= 10;
			reverseNumber += remainder;
			number /= 10;
		}
		//System.out.println("rev nr " + reverseNumber);
		return reverseNumber;
	}


	/**
	 * Get the amount of digits in a number
	 * @param number
	 * @return
	 */
	public static int getDigitCount(int number) {

		if(number < 0) {
			return -1;
		}

		int count = 0;

		if(number > 0) {
			while (number != 0) {
				count++;
				number /= 10;
			}
		} else if (number == 0){
			count = 1;
		}

		//System.out.println("digit count " + count);
		return count;
	}

}
