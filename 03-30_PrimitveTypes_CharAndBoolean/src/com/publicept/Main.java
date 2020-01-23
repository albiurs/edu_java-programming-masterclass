package com.publicept;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; // width of 16 bits -> unicode chars allowed
        char myUnicodeChar = '\u0044';
        System.out.println(myChar); // D
        System.out.println(myUnicodeChar); // D

        char myCopyrightChar = '©'; // width of 16 bits -> unicode chars allowed
        char myUnicodeCopyrightChar = '\u00a9';
        System.out.println(myCopyrightChar); // ©
        System.out.println(myUnicodeCopyrightChar); // ©

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverEighteen = true;
        System.out.println(myTrueBooleanValue); // true
        System.out.println(myFalseBooleanValue); // false
        System.out.println(isCustomerOverEighteen); // true
    }
}
