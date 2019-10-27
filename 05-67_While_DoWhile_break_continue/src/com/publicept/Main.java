package com.publicept;

public class Main {

    public static void main(String[] args) {

        /**
         *  while (condition == true) {
         *      > increment++;
         *  }
         */
        int count = 0;  // count variable must be declared before the while statement

        while (count < 5) {
            System.out.println("Count value is: " + count);
            count++;    // increment count manually
        }


        /**
         *  while (true) {
         *      if(condition) break;
         *      increment++;
         *  }
         */
        count = 0;      // count variable must be declared before the while statement

        while (true) {  // endless loop
            if(count >= 5) {
                /**
                 * break
                 */
                break;
            }
            System.out.println("Count value is: " + count);
            count++;
        }


        /**
         * do { } while (condition);
         * -> always executed at least once
         */
        count = 0;

        do {
            System.out.println("Count value was: " + count);
            count++;
        } while (count < 5);


        /**
         * continue & break
         */
        int number = 0;

        while (number < 15) {
            number++;

            if(number <= 5) {
                System.out.println("Skipping number " + number);
                /**
                 * continue
                 */
                continue;
            }

            System.out.println("Current number is " + number);

            if(number >= 10) {
                System.out.println("Breaking at " + number);
                /**
                 * break
                 */
                break;
            }
        }


        /**
         * Challenge: list even numbers within a range
         *      > continue
         */
        // Modify the while code below
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
        number = 0;
        int finishNumber = 20;
        count = 0;
        int maxCount = 5;

        while (number <= finishNumber) {

            number++;

            if(!evenNumber(number)) {
                /**
                 * continue
                 */
                continue;       // Go back to the start of the loop without executing the code below!
            }

            System.out.println("Even number " + number);    // executed only if number is even!

            count++;
            if (count >= maxCount) {
                break;
            }
        }

        System.out.println("Total even numbers found: " + count);



    }


    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    public static boolean evenNumber(int number) {

        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
