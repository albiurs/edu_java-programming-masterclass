package com.publicept;

public class GreatestCommonDivisor {

	public static int getGreatestCommonDivisor(int first, int second) {

		if(first < 10 || second < 10) {
			return -1;
		}

		int countFirst = 0;
		int remainderFirst = 0;
		int greatestCommonDivisor = 0;

		while (countFirst <= first) {

			countFirst++;
			remainderFirst = first % countFirst;
			System.out.println("count first " + countFirst);
			System.out.println("remainder first " + remainderFirst);

			if (remainderFirst == 0) {

				int countSecond = 0;
				int remainderSecond = 0;

				while (countSecond <= second) {

					countSecond++;
					remainderSecond = second % countSecond;
					System.out.println("count second " + countSecond);
					System.out.println("remainder second " + remainderSecond);

					if (remainderSecond == 0) {
						if (countFirst == countSecond) {
							greatestCommonDivisor = countFirst;
							System.out.println("gcd " + greatestCommonDivisor);
						}
					}
				}
			}
		}

		System.out.println("gcd " + greatestCommonDivisor);
		return greatestCommonDivisor;


	}
}
