package com.publicept.service;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * IntReaderImpl
 *
 * @author created by Urs Albisser, on 2020-05-02
 * @version 0.1
 */
public class IntReaderImpl implements IntReader{



	// === fields ===
	private static Scanner scanner = new Scanner(System.in);
	private static int arrayLength;


	// == constructors ==
	public IntReaderImpl() {
		// do nothing
	}


	// === public methods ===
	/**
	 * readIntegersArray()
	 * @return Initialized and filled array.
	 */
	@Override
	public int[] readIntegersArray() {

		int[] array = new int[readArrayLength()];

		for(int i=0; i<arrayLength; i++) {
			System.out.println("Please enter number " + (i+1) );
			array[i] = readIntegerByScanner();
		}
		return array;
	}


	/**
	 * readIntegerByScanner()
	 * @return Integer number
	 */
	@Override
	public int readIntegerByScanner() {

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



	// == private methods ==
	/**
	 * readArrayLength()
	 * @return Array length
	 */
	private int readArrayLength() {

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
}