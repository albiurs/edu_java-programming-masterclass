package com.publicept;

/*
Arrays Challenge
*/
// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main
 *
 * @author created by Urs Albisser, on 2020-02-07
 * @version 0.1
 */
public class Main {



	// == fields ==
	private static Scanner scanner = new Scanner(System.in);
	private static int arrayLength;
	private static int[] numbersArray = new	int[arrayLength];
	private static int[] tempArray;
	private static int[] arraySorted;



	// == public methods ==
	/**
	 * main()
	 *
	 * @param args Args
	 */
	public static void main(String[] args) {

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		// initialize array
		numbersArray = readIntegersArray();
		tempArray = new int[arrayLength+1];
		arraySorted = new int[arrayLength];

		// sort array
		tempArray = sortIntegers(numbersArray);

		// copy array elements
		for(int i=0; i<arraySorted.length; i++) {
			arraySorted[i] = tempArray[i];
		}

		// print arrays
		System.out.println("Original array:");
		printArray(numbersArray);
		System.out.println();
		System.out.println("tempArray:");
		printArray(tempArray);
		System.out.println();
		System.out.println("Sorted array:");
		printArray(arraySorted);
	}


	/**
	 * sortIntegers()
	 * @param array array to be sorted
	 * @return sorted array
	 */
	public static int[] sortIntegers(int[] array){

//		int[] sortedArray = new int[array.length+1];
//
//		for(int i=0; i<array.length; i++) {
//			sortedArray[i] = array[i];
//		}

		/*
		Arrays.copyOf()
		 */
		int[] sortedArray = Arrays.copyOf(array, array.length+1);

		sortedArray[array.length] = Integer.MIN_VALUE;


		/*
		My solution
		 */
		int counter = 0;

		while (counter < sortedArray.length) {

			for(int i=0; i<sortedArray.length-1; i++) {

				int swap;

				if(sortedArray[i] < sortedArray[i+1]) {
					swap = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = swap;

					counter = 0;
				}
			}

			counter ++;
		}

		/*
		Tim's solution
		 */
//		boolean flag = true;
//
//		while (flag) {
//
//			flag = false;
//
//			for(int i=0; i<sortedArray.length-1; i++) {
//
//				int swap;
//
//				if(sortedArray[i] < sortedArray[i+1]) {
//					swap = sortedArray[i];
//					sortedArray[i] = sortedArray[i+1];
//					sortedArray[i+1] = swap;
//
//					flag = true;
//				}
//			}
//		}

		return sortedArray;
	}


	/**
	 * printArray()
	 * @param array Number array to be printed
	 */
	public static void printArray(int[] array) {

		int counter = 0;

		for(int i=0; i<array.length; i++) {
			System.out.println("Number " + (counter+1) + ": " + array[i]);
			counter++;
		}
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

		// get array length
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
