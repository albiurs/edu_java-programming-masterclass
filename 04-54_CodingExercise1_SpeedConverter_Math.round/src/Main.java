/**
 * Main
 *
 * @author created by Urs Albisser, on 2020-01-26
 * @version 0.1
 */
public class Main {

	public static void main(String[] args) {

//		double miles = SpeedConverter.toMilesPerHour(10.5);
//		System.out.println("Miles = " + miles);

		SpeedConverter.printConversion(10.5); // 10.5 km/h = 7 mi/h
	}
}



/**
 * SpeedConverter
 * toMilesPerHour(double kilometersPerHour)
 * printConversion(double kilometersPerHour)
 *
 * Convert a speed in km/h into mi/h and round the result.
 * Print the converted result.
 *
 * @author created by Urs Albisser, on 2020-01-26
 * @version 0.1
 */
class SpeedConverter {

	/**
	 * toMilesPerHour()
	 * Convert a speed in km/h into miles and round the result
	 * @param kilometersPerHour	value in km/h
	 * @return	rounded result in miles
	 */
	public static long toMilesPerHour(double kilometersPerHour) {

		if(kilometersPerHour < 0) {
			return -1;
		}

		// 'milesPerHour' is correct but redundant
//		long milesPerHour = Math.round(kilometersPerHour / 1.609);
//		return milesPerHour;

		// best practice
		// Math.round: Math is built-in class of java
		return Math.round(kilometersPerHour / 1.609);
	}


	/**
	 * printConversion()
	 * @param kilometersPerHour Speed in km/h to be converted.
	 */
	public static void printConversion(double kilometersPerHour) {

		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			// convert km/h to mi/h
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h = " +
					milesPerHour + " mi/h");
		}
	}
}
