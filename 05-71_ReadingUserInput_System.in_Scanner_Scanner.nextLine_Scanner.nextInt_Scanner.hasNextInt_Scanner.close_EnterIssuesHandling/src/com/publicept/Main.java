package com.publicept;

import java.util.Scanner;

/**
 * Main
 * Use of Scanner functions without issues.
 *
 * main(String[] args)
 */
public class Main {

	/**
	 * main()
	 * @param args args
	 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // create new Scanner object

        System.out.println("Enter your year of birth: ");
		/*
		 * "Wrong Input Type Issue"
		 *
		 * Issue description:
		 * If letters are entered instead of a number, an exception is thrown back by Java and the program crashes!
		 *
		 * Solution:
		 * Check if the entered value is a proper number with .hasNextInt().
		 * Use an if statement to check the boolean of .hasNextInt() is true.
		 */
		boolean hasNextInt = scanner.hasNextInt();

		if(hasNextInt) {
			int yearOfBirth = scanner.nextInt(); // retrieve console input int value with the Scanner method .nextInt
			/*
			 * "Enter-Key-Issue"
			 *
			 * Issue description:
			 * Whenever reading a number from the scanner it's confirmed with enter, which ends the line and
			 * skips the next input.
			 * It's recommended to call .nextLine again without assigning a variable before entering another value
			 * to handle the "enter key issue" of skipping the next input, we have to call the .nexLine(), so that the
			 * scanner works as expected.
			 * Now, internally the Scanner is checking for a line separator and when we hit enter,
			 * we're typing a line separator, so that's interpreted as input.
			 * When we reach the .nextLine method, the input for this line becomes "enter", so is essentially skipped!
			 *
			 * SOLUTION:
			 * ==> There must be another empty .nextLine() method call right after reading a number with the scanner,
			 * to handle the next line character (enter key) issue! (see below...)
			 */
			scanner.nextLine();                         // handle next line character (enter key) issue

			System.out.println("Enter your name: ");
			String name = scanner.nextLine();           // retrieve console input String with the Scanner method .nextLine

			/*
			 * Negative Entry Of Number Issue
			 *
			 * Negative entered numbers lead to unexpected results.
			 *
			 * Solution:
			 * ==> use if statement to check a valid range of possible results.
			 */
			int age = 2020 - yearOfBirth;

			if(age >= 0 && age <= 120) {
				System.out.println("Your name is " + name + ", and your are " + age + " years old.");
			} else {
				System.out.println("Invalid year of birth.");
			}
		} else {
			System.out.println("Unable to parse year of birth.");
		}


		/*
		remove Scanner object to free up memory
		 */
        scanner.close();
    }
}
