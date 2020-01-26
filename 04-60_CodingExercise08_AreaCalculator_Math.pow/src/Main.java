/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // circle
        System.out.println("Area of circle: " + AreaCalculator.area(5.0)); // Area of circle: 78.539815

        // rectangle
        System.out.println("Area of rectangle: " + AreaCalculator.area(5.0, 7.0)); // Area of rectangle: 35.0
    }
}


/**
 * AreaCalculator
 *
 * area(double radius)      -> circle
 * area(double x, double y) -> rectangle
 */
class AreaCalculator {


    // == constants ==
    private static final double PI = 3.1415926d;


    // == public methods ==
    /**
     * Calculate the area (circle)
     * @param radius
     * @return area
     */
    public static double area(double radius) {

        if(radius < 0) {
            return -1.0d;
        }

        double area = Math.pow((2.0d * radius), 2) * PI / 4; // Math.pow(x, y) = x^y = power

        return area;
    }


    /**
     * Calculate the area (rectangle)
     * @param x
     * @param y
     * @return area
     */
    public static double area(double x, double y) {
        if(x < 0 || y <0) {
            return -1.0d;
        }

        return x * y;
    }
}
