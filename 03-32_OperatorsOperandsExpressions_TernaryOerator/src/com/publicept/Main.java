package com.publicept;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result = " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10;    // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // remainder / modulus / modulo of (4 % 3)
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++;   // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;   // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2;    // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10;   // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;    // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;    // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and top score is less then 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");;
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }


        /**
         * Ternary Operator
         */
        // Ternary Operator (=shortcut of if-then-else)
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient) >= 20 ? true : false;
        System.out.println("Is the Client is 18 or over? " + isEighteenOrOver);



        /**
         * Operators challenge
         */
        double myFirstDoubleValue = 20.00d;
        double mySecondDoubleValue = 80.01d;
        double myValuesTotal = (myFirstDoubleValue + mySecondDoubleValue) * 100.00d;
        System.out.println("My Values total is = " + myValuesTotal);
        double myRemainder = myValuesTotal % 40d;
        System.out.println("The modulus is: " + myRemainder);
        /*
        boolean isNoRemainder = false;
        if (myRemainder == 0) {
            isNoRemainder = true;
        }
        */
        boolean isNoRemainder = (myRemainder == 0) ? true : false;
        System.out.println("Is the modulus Zero: " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder.");
        } else {
            System.out.println("The modulus is actually Zero.");
        }
    }
}
