package com.publicept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
     * Intently creating an ArithmeticException
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
        } catch (InputMismatchException e) {
            return 0;
        }
    }
}
