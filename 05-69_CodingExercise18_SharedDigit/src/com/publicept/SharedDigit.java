package com.publicept;

public class SharedDigit {

	public static boolean hasSharedDigit(int numberOne, int numberTwo) {

		int checkNumberOne = numberOne;
		int	checkNumberTwo = numberTwo;
		
		//if (checkNumberOne >= 10 && checkNumberOne <= 99 && checkNumberTwo >= 10 && checkNumberTwo <= 99) {
		if (isInRange(checkNumberOne) && isInRange(checkNumberTwo)) {
			//System.out.println("NumberOne " + checkNumberOne);
			//System.out.println("NumberTwo " + checkNumberTwo);

			while (checkNumberOne != 0) {
				int digitOne = checkNumberOne % 10;
				//System.out.println("DigitOne " + digitOne);

				while (checkNumberTwo != 0) {
					int digitTwo = checkNumberTwo % 10;
					//System.out.println("DigitTwo " + digitTwo);

					if (digitOne == digitTwo) {
						//System.out.println("true");
						return true;
					}
					checkNumberTwo /= 10;
				}
				checkNumberTwo = numberTwo;

				checkNumberOne /= 10;
			}
		}
		return false;
	}

	public static boolean isInRange(int number) {
		//System.out.println("isInRangNumber: " + number);
		//System.out.println((number >= 10 && number <= 99));
		return (number >= 10 && number <= 99);

	}
}
