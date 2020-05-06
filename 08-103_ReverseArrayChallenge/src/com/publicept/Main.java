package com.publicept;

/*
Reverse Array Challenge:
-Write a method called reverse() with an int array as a parameter.
-The method should not return any value. In other words, the method is allowed to modify the array parameter.
-In main() test the reverse() method and print the array both reversed and non-reversed.
-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
 */

import com.publicept.service.ArrayModifier;
import com.publicept.service.ArrayModifierImpl;
import com.publicept.service.IntReader;
import com.publicept.service.IntReaderImpl;

/**
 * Main
 *
 * @author created by Urs Albisser, on 2020-05-02
 * @version 0.1
 */
public class Main {



	// === fields ===
//	IntReaderImpl integerReader = new IntReaderImpl();
//	private static Scanner scanner = new Scanner(System.in);
//	private static int arrayLength;
//	private int[] numbersArray;



	// === public methods ===
	/**
	 * main()
	 * @param args
	 */
	public static void main(String[] args) {

		IntReader intReader = new IntReaderImpl();
		ArrayModifier arrayModifier = new ArrayModifierImpl();

		int[] numbersArray;
		int[] reverseArray;

		numbersArray = intReader.readIntegersArray();

		reverseArray = arrayModifier.reverseArray(numbersArray);

		for(int i=0; i<numbersArray.length; i++) {
			System.out.print("numbersArray: " + numbersArray[i] + " ");
		}
		System.out.println();

		for(int i=0; i<reverseArray.length; i++) {
			System.out.print("reverseArray: " + reverseArray[i] + " ");
		}
		System.out.println();

	}


//	/**
//	 * readIntegersArray()
//	 * @return Initialized and filled array.
//	 */
//	public static int[] readIntegersArray() {
//
//		int[] array = new int[readArrayLength()];
//
//		for(int i=0; i<arrayLength; i++) {
//			System.out.println("Please enter number " + (i+1) );
//			array[i] = readIntegerByScanner();
//		}
//		return array;
//	}
//
//
//	/**
//	 * readArrayLength()
//	 * @return Array length
//	 */
//	public static int readArrayLength() {
//
//		// read array length from console
//		while (true) {
//
//			System.out.println("How many numbers do you want to sort?");
//			arrayLength = readIntegerByScanner();
//
//			if(arrayLength > 1) {
//				break;
//			} else if(arrayLength == 1) {
//				System.out.println("Might not make sense to read only one number. But go ahead...");
//				break;
//			}
//			System.out.println("Number must be positive!");
//		}
//
//		return arrayLength;
//	}
}
