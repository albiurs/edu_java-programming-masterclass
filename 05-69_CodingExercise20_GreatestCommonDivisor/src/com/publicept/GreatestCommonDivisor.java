package com.publicept;

/**
 * GreatestCommonDivisor
 *
 * getGreatestCommonDivisor(int first, int second)
 */
public class GreatestCommonDivisor {

	/**
	 * getGreatestCommonDivisor()
	 * @param firstNumber first number to be compared
	 * @param secondNumber second number to be compared
	 * @return greatest common divisor GCD
	 */
	public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {

		if(firstNumber < 10 || secondNumber < 10) {
			return -1;
		}

		int countFirst = 0;
		int remainderFirst = 0;
		int greatestCommonDivisor = 0;

		while (countFirst <= firstNumber) {

			countFirst++;
			remainderFirst = firstNumber % countFirst;
			System.out.println("count firstNumber " + countFirst);
			System.out.println("remainder firstNumber " + remainderFirst);

			if (remainderFirst == 0) {

				int countSecond = 0;
				int remainderSecond = 0;

				while (countSecond <= secondNumber) {

					countSecond++;
					remainderSecond = secondNumber % countSecond;
					System.out.println("count secondNumber " + countSecond);
					System.out.println("remainder secondNumber " + remainderSecond);

					if (remainderSecond == 0) {
						if (countFirst == countSecond) {
							greatestCommonDivisor = countFirst;
							System.out.println("gcd " + greatestCommonDivisor);
						}
					}
				}
			}
		}

		return greatestCommonDivisor;
	}
}
