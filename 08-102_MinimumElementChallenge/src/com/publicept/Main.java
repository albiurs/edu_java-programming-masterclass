package com.publicept;

/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.

Tips:
-Assume that the user will only enter numbers, never letters
-For simplicity, create a Scanner as a static field to help with data input
-Create a new console project with the name �eMinElementChallenge�f
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main
 * Challenge to find the minimum integer number within an array.
 *
 * main()
 * findMin()
 * readIntegersArray()
 * readArrayLength()
 * readIntegerByScanner()
 *
 * @author created by Urs Albisser, on 2020-04-17
 * @version 0.1
 */
public class Main {



	// == fields ==
	private static Scanner scanner = new Scanner(System.in);
	private static int arrayLength;
	private static int[] numbersArray;
	private static int minNumber;



	// == public methods ==
	/**
	 * main()
	 * @param args
	 */
	public static void main(String[] args) {

		// get numbers array
		numbersArray = readIntegersArray();

		// find minimum number in array
		minNumber = findMin(numbersArray);

		// print minimum number
		System.out.println("The minimum Number in the array is: " + minNumber);
	}


	/**
	 * findMin()
	 * Find the smallest number in an array.
	 * @param array int array to be checked
	 * @return		minimum number in array
	 */
	public static int findMin(int[] array) {

		int minNumber = Integer.MAX_VALUE;

		for(int i=0; i<array.length; i++) {
			if(i<minNumber) {
				minNumber = array[i];
			}
		}

		return minNumber;
	}


	/**
	 * readIntegersArray()
	 * @return Initialized and filled array.
	 */
	public static int[] readIntegersArray() {

		int[] array = new int[readArrayLength()];

		for(int i=0; i<arrayLength; i++) {
			System.out.println("Please enter number " + (i+1) );
			array[i] = readIntegerByScanner();
		}
		return array;
	}


	/**
	 * readArrayLength()
	 * @return Array length
	 */
	public static int readArrayLength() {

		// read array length from console
		while (true) {

			System.out.println("How many numbers do you want to sort?");
			arrayLength = readIntegerByScanner();

			if(arrayLength > 1) {
				break;
			} else if(arrayLength == 1) {
				System.out.println("Might not make sense to read only one number. But go ahead...");
				break;
			}
			System.out.println("Number must be positive!");
		}

		return arrayLength;
	}


	/**
	 * readIntegerByScanner()
	 * @return Integer number
	 */
	public static int readIntegerByScanner() {

		int i;

		while(true) {
			try {
				i = scanner.nextInt();
				scanner.nextLine();

				while(i >= Integer.MAX_VALUE || i <= Integer.MIN_VALUE) {
					System.out.println("Value must be within the range of " +
							(Integer.MIN_VALUE+1) + " and " +
							(Integer.MAX_VALUE-1));
					scanner.nextInt();
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Only numbers are allowed within the range of " +
						(Integer.MIN_VALUE+1) + " and " +
						(Integer.MAX_VALUE-1));
				scanner.next();
			}
		}

		return i;
	}


}
