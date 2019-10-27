package com.publicept;

public class SumOddRange {

	/**
	 * Check number to be odd
	 * @param number
	 * @return
	 */
	public static boolean isOdd(int number) {

		if(number > 0 && number % 2 != 0) return true;
		return false;
	}


	public static int sumOdd(int start, int end) {

		int sum = 0;

		if(start > 0 && end > 0 && end >= start) {
			for(int i=start; i<=end; i++) {

				if(isOdd(i)) {
					sum += i;
					//System.out.println(i);
					//System.out.println(sum);
				}

			}
			return sum;
		}

		return -1;
	}

}
