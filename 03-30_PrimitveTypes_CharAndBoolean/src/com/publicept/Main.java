package com.publicept;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; // width of 16 bits -> unicod chars allowed
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '©'; // width of 16 bits -> unicod chars allowed
        char myUnicodeCopyrightChar = '\u00a9';
        System.out.println(myCopyrightChar);
        System.out.println(myUnicodeCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverEighteen = true;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
        System.out.println(isCustomerOverEighteen);

    }
}
