public class Main {

    public static void main(String[] args) {

        System.out.println("10'000 at 2% = " + calculateInterest(10_000.0, 2.0));

        for(int i=0; i<5; i++) {
            System.out.println("Loop: " + i);
        }

        for(int i=0; i<=10; i+=2) {
            System.out.println("Even numbers: " + i);
        }

        /**
         * Challenge
         *
         * NEW: String.format(String format, Object... args)
         */
        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        for(int i=2; i<9; i++) {    // i auto-converted to double by Java
            // output of 700.00000000001
            System.out.println("10'000 at " + i + "% interest rate = " + calculateInterest(10_000.0, i));
            // String.format(String format, Object... args) = pass the value form the method trough the String.format command.
            // "%.2f" = convert the number and output with 2 decimal points.
            System.out.println("10'000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(10_000.0, i)));
        }

        System.out.println("******************");

        /**
         * Challenge
         */
        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        for(int i=8; i>1; i--) {
            System.out.println("10'000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(10_000.0, i)));
        }


        /**
         * Challenge 2: Check range for prime
         */
        checkRangeForPrime(0, 100);

    }


    /**
     * Challenge 2: Check range of numbers for primes
     */
    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint:  Use the break; statement to exit
    public static void checkRangeForPrime(int rangeFrom, int rangeTo) {

        int primeCounter = 0;

        for(int i = rangeFrom; i <= rangeTo; i++) {

            boolean isPrime = isPrime(i);

            if(isPrime) {
                primeCounter++;
                System.out.println("Prime number " + primeCounter + " is " + i);
            }

            if(primeCounter > 10) {
                System.out.println("Exiting for loop");
                break;
            }

        }
    }

    /**
     * Test if a number is a prime number
     * @param n     Number to be tested
     * @return      Boolean: true = prime; false != prime
     */
    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        //for(int i = 2; i <= n/2; i++) {   // correct but slower due to more loops required
        for(int i = 2; i <= (long) Math.sqrt(n); i++) {   // performance optimized due to less loops required
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }


    /**
     * Calulate interest rate
     * @param amount
     * @param interestRate
     * @return
     */
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
