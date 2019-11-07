package com.publicept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * To exception types are defined in java.lang:
         * 1. Exception (java.lang.Exception)
         *           java.lang.Object
         *              java.lang.Throwable
         *                  java.lang.Exception
         * 2. Runtime-Exception
         *               java.lang.Object
         *                  java.lang.Throwable
         *                      java.lang.Exception
         *                          java.lang.RuntimeException
         *
         * -> all exceptions are sub-classes of those two main exception types.
         * -> Exception itself extends the class Throwable (java.lang.Throwable).
         */



        /**
         * Test error handling methods Nr. 1
         */
        System.out.println("Test error handling methods Nr. 1");
        int x = 98;
        int y = 0;
//        System.out.println(divide(x, y));
        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));
        System.out.println();

        /**
         * Test error handling methods Nr. 2
         */
        System.out.println("Test error handling methods Nr. 2");
        int z = getInt();
        System.out.println("z is " + z);
        System.out.println();
        z = getIntLBYL();
        System.out.println("z is " + z);
        System.out.println();
        z = getIntEAFP();
        System.out.println("z is " + z);
        System.out.println();
    }

    /**
     * No error handling Nr. 1
     * Intently causing an ArithmeticException
     */
    private static int divide(int x, int y) {
        return x / y;
    }

    /**
     * LBYL Nr. 1
     * = "Look Before You Leap"-System of error handling
     */
    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Forbidden operation: division by 0");
            return 0;
        }
    }

    /**
     * EAFP Nr. 1
     * = "Easy to Ask for Forgiveness than Permission"-System of error handling
     */
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Forbidden operation: division by 0");
            return 0;
        }
    }

    /**
     *  No Error handling Nr. 2
     *  Entering a string causes an InputMismatchException
     */
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an integer value: ");
        return s.nextInt();
    }

    /**
     * LBYL Nr. 2
     * = "Look Before You Leap"-System of error handling
     */
    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.print("Please enter an integer value: ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            // Character > The {@code Character} class wraps a value of the primitive type {@code char} in an object.
            // Character.isDigit() > Determines if the specified character is a digit.
            // input.charAT(i) > extracts the character at position i and returns the {@code char} value at the specified index.
            if(!Character.isDigit(input.charAt(i))) {
                // if the character is not a digit...
                isValid = false;
                break;
            }
        }

        if(isValid) {
            return Integer.parseInt(input);
        }

        return 0;
    }

    /**
     * EAFP Nr. 2
     * = "Easy to Ask for Forgiveness than Permission"-System of error handling
     */
    public static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an integer value: ");

        try {
            return s.nextInt();
        // The following "catch (Exception e)" works, but is not recommended as it's unspecific.
//        } catch (Exception e) {
        } catch (InputMismatchException e) {
            return 0;
        }
    }
}
