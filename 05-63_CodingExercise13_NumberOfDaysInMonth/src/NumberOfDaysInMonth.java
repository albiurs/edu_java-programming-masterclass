public class NumberOfDaysInMonth {

	/**
	 * Check if a year is a leap year (Depends on: LeepYear.java)
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {

		return LeapYear.isLeapYear(year);

	}

//	/**
//	 * Check if a year is a leap year
//	 * @param year
//	 * @return
//	 */
//	public static boolean isLeapYear (int year){
//		if(year >= 1 && year <= 9999) {
//			if(year % 4 == 0) {
//				if(year % 100 == 0) {
//					if(year % 400 == 0) return true;
//					return false;
//				}
//				return true;
//			}
//		}
//		return false;
//	}


	public static int getDaysInMonth(int month, int year) {

		if(month <1 || month > 12) return -1;
		if(year <1 || year > 9999) return -1;

		int numberOfDaysInMonth = 0;

		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				numberOfDaysInMonth = 31;
				break;
			case 2:
				if (isLeapYear(year)) {
					numberOfDaysInMonth = 29;
					break;
				} else {
					numberOfDaysInMonth = 28;
					break;
				}
			case 4: case 6: case 9: case 11:
				numberOfDaysInMonth = 30;
				break;
			default:
				break;
		}

		return numberOfDaysInMonth;
	}

}
