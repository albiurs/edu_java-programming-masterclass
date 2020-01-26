/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        IntEqualityPrinter.printEqual(1,1,1); // All numbers are equal
        IntEqualityPrinter.printEqual(1,2,3); // All numbers are different
        IntEqualityPrinter.printEqual(1,2,2); // Neither all numbers are equal nor different
    }
}


/**
 * IntEqualityPrinter
 *
 * printEqual(int a, int b, int c)
 */
class IntEqualityPrinter {

    /**
     * printEqual()
     * Prints if:
     * - All numbers are equal
     * - All numbers are different
     * - Neither all numbers are equal or different
     *
     * @param a number a
     * @param b number b
     * @param c number c
     */
    public static void printEqual(int a, int b, int c) {
        if(a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if(a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if(a != b && b != c && a != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all numbers are equal nor different");
        }
    }
}
