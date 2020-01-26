/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int year = 1600;

        boolean isLeapYear = LeapYear.isLeapYear(year);

        if (isLeapYear == true) {
            System.out.println(year + " is a leap year!"); // 1600 is a leap year!
        } else {
            System.out.println(year + " is NOT a leap year!");
        }

    }
}


/**
 * LeapYear
 * Check if a year is a leap year.
 *
 * isLeapYear(int year)
 */
class LeapYear {

    /**
     * Check if a year is a leap year.
     * @param year Year to be checked.
     * @return The submitted year is a leap year (true) or it is not (false).
     */
    public static boolean isLeapYear(int year){

        if(year >= 1 && year <= 9999) {

            // if year is evenly divisible by 4...
            if(year % 4 == 0) {

                // if year is also evenly divisible by 100...
                if(year % 100 == 0) {

                    // if year is also evenly divisible by 400...
                    if(year % 400 == 0) {
                        return true;
                    }
                    return false;
                }
                return true; // if year is evenly divisible by 100, it's always a leap year!
            }
            return false; // not a leap year, if NOT evenly divisible by 4.
        }
        return false; // invalid input
    }
}
