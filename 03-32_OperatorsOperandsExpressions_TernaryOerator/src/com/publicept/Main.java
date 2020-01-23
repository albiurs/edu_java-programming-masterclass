package com.publicept;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result); // 1 + 2 = 3

        int previousResult = result;
        System.out.println("previous result = " + previousResult); // previous result = 3

        result = result - 1;
        System.out.println("3 - 1 = " + result); // 3 - 1 = 2

        result = result * 10;
        System.out.println("2 * 10 = " + result); // 2 * 10 = 20

        result = result / 5;
        System.out.println("20 / 5 = " + result); // 20 / 5 = 4

        result = result % 3;                     // remainder / modulus / modulo
        System.out.println("4 % 3 = " + result); // 4 % 3 = 1

        // result = result + 1
        result++;
        System.out.println("1++ = " + result); // 1++ = 2

        result--;
        System.out.println("2-- = " + result); // 2-- = 1

        //result = result + 2;
        result += 2;
        System.out.println("1 += 2 = " + result); // 1 += 2 = 3

        // result = result * 10
        result *= 10;
        System.out.println("3 *= 10 = " + result); // 3 *= 10 = 30

        // result = result / 3
        result /= 3;
        System.out.println("30 /= 3 = " + result); // 30 /= 3 = 10

        // result = result - 2
        result -= 2;
        System.out.println("10 -= 2 = " + result); // 10 -= 2 = 8

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");        // It is not an alien!
            System.out.println("And I am scared of aliens!"); // And I am scared of aliens!
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!"); // no output
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            // output yes: Greater than second top score and top score is less then 100.
            System.out.println("Greater than second top score and top score is less then 100.");

        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            // output yes: Either or both of the conditions are true.
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true"); // output yes: This is true
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen"); // output yes: This is not supposed to happen
        }


        /**
         * Ternary Operator
         * = shortcut of if-then-else
         */
        int ageOfClient = 20;
        // read: is ageOfClient >= 20 ? then it's true, else it's false.
        boolean isEighteenOrOver = (ageOfClient) >= 20 ? true : false;
        System.out.println("Is the Client is 18 or over? " + isEighteenOrOver); // Is the Client is 18 or over? true


        /**
         * Double Operators Challenge
         */
        double myFirstDoubleValue = 20.00d;
        double mySecondDoubleValue = 80.01d;

        double myValuesTotal = (myFirstDoubleValue + mySecondDoubleValue) * 100.00d;
        System.out.println("(20.00d + 80.01d) * 100.00d = " + myValuesTotal); // (20.00d + 80.01d) * 100.00d = 10001.0

        double myRemainder = myValuesTotal % 40d;
        System.out.println("The modulus is: " + myRemainder); // The modulus is: 1.0


        /**
         * Remainder Challenge
         */
//        boolean isNoRemainder;
//        if (myRemainder == 0) {
//            isNoRemainder = true;
//        } else {
//            isNoRemainder = false;
//        }

        boolean isNoRemainder = (myRemainder == 0) ? true : false;
        System.out.println("Is the modulus Zero: " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder.");           // Got some remainder.
        } else {
            System.out.println("The modulus is actually Zero."); // skipped
        }
    }
}
