package ch.publicept;

import java.util.Scanner;

/**
 * MainScannerExample
 * public static void main(String[] args)
 * Enter
 *
 * getIntegers(int numberOfArrayElements)
 * getAverage(int[] array)
 *
 * @author created by Urs Albisser, on 2019-12-30
 * @version 0.0.1
 */
public class MainScannerExample {



	// == fields ==
	private static Scanner scanner = new Scanner(System.in);



	/**
	 * main()
	 *
	 * @param args args
	 */
	public static void main(String[] args) {

		// initialize array = new int[5] by using the Scanner
		int[] myIntegers = getIntegerArrayByScanner(5);

		// print array values
		for(int i=0; i<myIntegers.length; i++) {
			System.out.println("Element " + i + ", entered value " + myIntegers[i]);
		}

		// print mean of array values
		System.out.println("The average is " + getAverage(myIntegers));
	}



	/**
	 * getIntegers()
	 * Initialize array with individual numbers using the Scanner.
	 * @param arrayLength Array length
	 * @return Initialized array[]
	 */
	public static int[] getIntegerArrayByScanner(int arrayLength) {

		int[] array = new int[arrayLength];

		System.out.println("Enter " + arrayLength + " integer values...\r");

		for(int i=0; i<array.length; i++) {
			System.out.print("Enter value " + (i+1) + ": ");
			array[i] = scanner.nextInt();
		}

		return array;
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
