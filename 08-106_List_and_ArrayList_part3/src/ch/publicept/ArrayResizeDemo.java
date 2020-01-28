package ch.publicept;

import java.util.Scanner;

import java.util.Scanner;

/**
 * ch.publicept.ArrayResizeDemo
 * main(String[] args)
 *
 * getInput()
 * printArray(int[] arr)
 * resizeArray()
 *
 * @author created by Urs Albisser, on 2020-01-27
 * @version 0.1
 */
public class ArrayResizeDemo {

	private static Scanner scanner = new Scanner(System.in);
	private static int[] baseData = new int[10];

	public static void main(String[] args) {

		System.out.println("Enter 10 integers:");
		getInput();
		System.out.println("Array with 10 elements:");
		printArray(baseData);

		resizeArray();
//		System.out.println("Enter 12 integers:");
//		getInput();
		baseData[10] = 67;
		baseData[11] = 34;
		System.out.println("Array with 12 elements:");
		printArray(baseData);

	}


	/**
	 * getInput()
	 * Initialize array baseData using the Scanner.nextInt()
	 */
	private static void getInput() {
		for(int i = 0; i < baseData.length; i++) // no curly brackets needed
			baseData[i] = scanner.nextInt();
	}


	/**
	 * printArray()
	 * @param arr array to be printed
	 */
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) // no curly brackets needed
			System.out.print(arr[i] + " ");
		System.out.println();
	}


	/**
	 * resizeArray()
	 * resizeArray preserving all elements
	 */
	private static void resizeArray() {

		int[] original = baseData; // take a copy of baseData array

		baseData = new int[12]; // re-initialize the array baseDate with new 12 elements

		for (int i = 0; i < original.length; i++) // no curly brackets needed
			baseData[i] = original[i]; // store elements from the old array back in to the new array
	}

}
