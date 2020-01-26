package com.publicept.keywordsandexpressions;

public class Main {

    // public, static, void = reserved key words in Java (= orange (dark mode) or blue (print))
    // https://en.wikipedia.org/wiki/List_of_Java_keywords
    public static void main(String[] args) {

        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);   // "kilometers = (100 * 1.609344)" is the expression.
        double kilometers2 = (100 * 1.609344);  // The entire line is a statement.

        int highscore = 50;
        if (highscore == 50) {  // "highscore == 50" is the expression
            System.out.println("\"highscore == 50\" is the expression"); // component within the bracket = expression
            System.out.println("This is an expression too."); // component within the bracket = expression (including "")
        }
    }
}
