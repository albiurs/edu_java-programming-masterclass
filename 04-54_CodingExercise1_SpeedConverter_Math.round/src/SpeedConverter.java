public class SpeedConverter {

	/**
	 * Convert a speed in km/h into miles and round the result
	 * @param kilometersPerHour	value in km/h
	 * @return	rounded result in miles
	 */
	public static long toMilesPerHour(double kilometersPerHour) {

		if(kilometersPerHour < 0) {
			return -1;
		}

		// Math.round: Math is built-in class of java

		// 'milesPerHour' is correct but redundant
//		long milesPerHour = Math.round(kilometersPerHour / 1.609);
//		return milesPerHour;

		// best practice
		return Math.round(kilometersPerHour / 1.609);
	}


	public static void printConversion(double kilometersPerHour) {

		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h = " +
					milesPerHour + " mi/h");
		}
	}
}
