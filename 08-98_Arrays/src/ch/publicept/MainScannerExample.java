package ch.publicept;

import java.util.Scanner;

/**
 * MainScannerExample
 *
 * @author created by Urs Albisser, on 2019-12-30
 * @version 0.0.1
 */
public class MainScannerExample {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * main()
	 * @param args
	 */
	public static void main(String[] args) {

		int[] myIntegers = getIntegers(5);

		// print array values
		for(int i=0; i<myIntegers.length; i++) {
			System.out.println("Element " + i + ", entered value " + myIntegers[i]);
		}

		// print mean of array values
		System.out.println("The average is " + getAverage(myIntegers));
	}

	/**
	 * getIntegers()
	 * Initialize array using the Scanner
	 * @param numberOfArrayElements	Length of array
	 * @return						Initialized array
	 */
	public static int[] getIntegers(int numberOfArrayElements) {

		System.out.println("Enter " + numberOfArrayElements + " integer values.\r");
		int[] values = new int[numberOfArrayElements];

		for(int i=0; i<values.length; i++) {
			System.out.print("Enter value " + (i+1) + ": ");
			values[i] = scanner.nextInt();
		}

		return values;
	}

	/**
	 * getAverage()
	 * Calculate the mean of an array.
	 * @param array	Array to be calculated
	 * @return		Average of array values
	 */
	public static double getAverage(int[] array) {

		int sum = 0;

		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}

		return (double)sum	/ (double)array.length;	// casting int to double
	}
}
