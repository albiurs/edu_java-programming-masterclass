package com.publicept;

public class Main {

    public static void main(String[] args) {


        /**
         * If-else example
         */
//        int value = 2;
//        if(value == 1) {
//            System.out.println("value was 1");
//        } else if(value == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }



        /**
         * Switch-Example
         *
         * In Java versions up to v7, only primitive Types were supported.
         * From v8, also Strings can be tested in the switch statement.
         */
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

                // shortcut for testing several cases
            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                System.out.println("actually it was a " + switchValue);
                break;

            default:
                System.out.println("was not a value between 1 and 5");
                break;
        }



        /**
         * Challenge: switch with cahr
         */
        char myChar = 'D';

        switch(myChar) {
            case 'A':
                System.out.println("was A");
                break;

            case 'B':
                System.out.println("was B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("was " + myChar);
                break;

            default:
                System.out.println("was not A, B, C, D or E");
                break;
        }


        /**
         * Switch with Strings
         */
        String month = "January";

        // String.toLowerCase(): Method of the class String to convert the String to lower case.
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("not sure");
        }

    }
}
