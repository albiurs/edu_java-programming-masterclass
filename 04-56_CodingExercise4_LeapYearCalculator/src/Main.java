public class Main {

    public static void main(String[] args) {
        int year = 1600;
        boolean isLeapYear = LeapYear.isLeapYear(year);
        if (isLeapYear == true) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is NOT a leap year!");
        }

    }
}
