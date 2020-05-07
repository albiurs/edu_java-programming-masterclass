package com.publicept;

/*
Reverse Array Challenge:
-Write a method called reverse() with an int array as a parameter.
-The method should not return any value. In other words, the method is allowed to modify the array parameter.
-In main() test the reverse() method and print the array both reversed and non-reversed.
-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
 */

import com.publicept.service.ArrayService;
import com.publicept.service.ArrayServiceImpl;

/**
 * Main
 *
 * @author created by Urs Albisser, on 2020-05-02
 * @version 0.1
 */
public class Main {

	/**
	 * main()
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		Run Reverse Array Test
		 */
		ArrayService arrayService = new ArrayServiceImpl();

		arrayService.setInitNumbersArray();
		arrayService.setReverseArray();
		arrayService.printInitNumbersArray();
		arrayService.printReverseIntegerArray();
	}
}