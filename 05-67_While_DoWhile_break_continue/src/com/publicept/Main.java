package com.publicept;

import org.w3c.dom.ls.LSOutput;

/**
 * Main
 *
 * main(String[] args)
 * isEvenNumber(int number)
 */
public class Main {

    public static void main(String[] args) {

        /*
         *  while (condition == true) {
         *      -> increment loopCounter++;
         *  }
         */
        int loopCounter = 0;  // counter variable must be declared before the while statement

        while (loopCounter < 5) {
            System.out.println("Count value is: " + loopCounter);
            loopCounter++;    // increment count manually
        }
        System.out.println();


        /*
         *  while (true) {
         *      if(condition) -> break;
         *      increment++;
         *  }
         */
        loopCounter = 0;      // count variable must be declared before the while statement

        while (true) {  // endless loop
            if(loopCounter >= 5) {
                /*
                 * break out of while loop
                 */
                break;
            }
            System.out.println("Count value is: " + loopCounter);
            loopCounter++;
        }
        System.out.println("Skip values > 4");
        System.out.println();


        /*
         * do { } while (condition);
         * -> always executed at least once
         */
        loopCounter = 0;

        do {
            System.out.println("Count value was: " + loopCounter);
            loopCounter++;
        } while (loopCounter < 5);
        System.out.println();


        /*
         * continue & break
         */
        int number = 0;

        while (number < 15) {
            number++;

            if(number <= 5) {
                System.out.println("Skipping number " + number);
                /*
                 * continue while loop...
                 */
                continue;
            }

            System.out.println("Current number is " + number);

            if(number >= 10) {
                System.out.println("Breaking at " + number);
                /*
                 * break out of while loop!
                 */
                break;
            }
        }
        System.out.println();


        /*
         * Challenge
         * List even numbers within a range
         *      > continue
         */
        // Modify the while code below
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        number = 0;
        loopCounter = 0;
        int finishNumber = 20;
        int maxCount = 5;

        while (number <= finishNumber) {

            number++;

            if(!isEvenNumber(number)) {
                /*
                 * continue while loop...
                 */
                continue;       // Go back to the start of the loop without executing the code below!
            }

            System.out.println("Even number " + number);    // executed only if number is even!

            loopCounter++;

            // break while loop after maxCount number of even numbers were found!
            if (loopCounter >= maxCount) {
                break;
            }
        }

        System.out.println("Total even numbers found: " + loopCounter);
    }


    /**
     * isEvenNumber()
     * @param number number to be tested as even
     * @return even number (=true), odd number (=false)
     */
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    public static boolean isEvenNumber(int number) {

        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
