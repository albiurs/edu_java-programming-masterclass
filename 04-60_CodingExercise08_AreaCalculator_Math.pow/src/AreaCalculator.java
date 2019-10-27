public class AreaCalculator {

	private static final double PI = 3.1415926d;

	/**
	 * Calculate the area (circle)
	 * @param radius
	 * @return
	 */
	public static double area(double radius) {

		if(radius < 0) {
			return -1.0d;
		}

		double area = Math.pow((2.0d * radius), 2) * PI / 4; // Math.pow(x, y) = power

		return area;
	}


	/**
	 * Calculate the area (rectangle)
	 * @param x
	 * @param y
	 * @return
	 */
	public static double area(double x, double y) {
		if(x < 0 || y <0) {
			return -1.0d;
		}

		return x * y;
	}


}
