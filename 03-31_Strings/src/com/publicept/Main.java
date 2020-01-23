package com.publicept;

public class Main {

    public static void main(String[] args) {
	    // primitive data types:
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String
        String myString = "This is a string";
        System.out.println("My string = " + myString); // My string = This is a string
        myString = myString + ", and this is more.";
        System.out.println("My string = " + myString); // My string = This is a string, and this is more.
        myString = myString + " \u00a9 2019";
        System.out.println("My string = " + myString); // My string = This is a string, and this is more. © 2019

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString); // 250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string = " + lastString); // Last string = 1050

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last string = " + lastString); // Last string = 1050120.47

    }
}
