package com.publicept;

public class Main {

    public static void main(String[] args) {

        /**
         * parse / convert String to int
         *
         * Integer. = wrapper class
         * .parseInt = mehtod of Integer.
         */
        String numberAsString = "2019";
        System.out.println("numberAs String = " + numberAsString);

        int numberInt = Integer.parseInt(numberAsString); // Wrapper class method Integer.parseInt > parse String to int
        System.out.println("number = " + numberInt);

        numberAsString += 1;       // 1 converted to a String and appended > concatenated the two Strings.
        numberInt += 1;            // calculates result.
        System.out.println("numberAs String = " + numberAsString);  // numberAs String = 20191
        System.out.println("numberInt = " + numberInt);                   // number = 2020


        System.out.println("**********************");



        /**
         * parse / convert String to double
         *
         * Double. = wrapper class
         * .parseDouble = mehtod of Integer.
         */

        String numberAsString2 = "2019.888";

        double numberDouble = Double.parseDouble(numberAsString2);      // wrapper class Double, mehtod .parseDouble
        numberAsString2 += 1;    // 1 converted to a String and appended > concatenated the two Strings.
        numberDouble += 1;       // calculates result.
        System.out.println("numberAs String 2 = " + numberAsString2);   // numberAs String 2 = 2019.8881
        System.out.println("numberDouble = " + numberDouble);           // 2020.888

    }
}
