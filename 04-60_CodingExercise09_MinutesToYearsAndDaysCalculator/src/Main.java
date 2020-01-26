/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
}


/**
 * MinutesToYearsDaysCalculator
 *
 * printYearsAndDays(long minutes)
 */
class MinutesToYearsDaysCalculator {

    /**
     * printYearsAndDays()
     * Calculate Years and Days from Minutes.
     * @param minutes amount of minutes to be calculated
     */
    public static void printYearsAndDays(long minutes) {

        long days = minutes / (60 * 24);
        long remainingDays = days % 365; // modulus
        long years = days / 365;

        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
            // 561600 min = 1 y and 25 d
        }

    }
}
