package com.publicept;

public class Main {

    public static void main(String[] args) {
	    // primitive data types
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
        System.out.println("My string = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string = " + myString);
        myString = myString + " \u00a9 2019";
        System.out.println("My string = " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string = " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last string = " + lastString);

    }
}
