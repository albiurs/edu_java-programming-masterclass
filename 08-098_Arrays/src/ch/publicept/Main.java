package ch.publicept;

/**
 * Main
 * main(String[] args)
 *
 * printArray(int[] array)
 *
 * @author created by Urs Albisser, on 2019-12-29
 * @version 0.0.1
 */
public class Main {

	/**
	 * main()
	 * Test Arrays
	 * @param args args
	 */
	public static void main(String[] args) {

		int[] myFirstIntArray = new int[25];	// declare and initialize array with 25 elements with default values
												// default values:
												// int = 0;
												// boolean = false;
												// String and other Objects = null
		System.out.println("myFirstIntArray.length = " + myFirstIntArray.length); // myFirstIntArray.length = 25

		int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; // declare and initialize array with 10 initialized elements
		myIntArray[5] = 50;				// element 6 = 50
		double[] myDoubleArray = new double[10]; // declare and initialize array with 10 elements

		System.out.println("Element 0 in Array: " + myIntArray[0]); // 1
		System.out.println("Element 7 in Array: " + myIntArray[5]); // 6
		System.out.println("Element 9 in Array: " + myIntArray[9]); // 10
		System.out.println();

		// initialize myIntArray using a for loop
//		for(int i=0; i<10; i++) {
		for(int i=0; i<myIntArray.length; i++) {
			myIntArray[i] = i * 10;
		}

		printArray(myIntArray);	// Print myIntArray using the method printArray

	}

	/**
	 * printArray()
	 * Print an array to the console
	 * @param array
	 */
	public static void printArray(int[] array) {

		for(int i=0; i<array.length; i++) {
			System.out.println("Element " + i + ", value is " + array[i]);
		}
	}
}
