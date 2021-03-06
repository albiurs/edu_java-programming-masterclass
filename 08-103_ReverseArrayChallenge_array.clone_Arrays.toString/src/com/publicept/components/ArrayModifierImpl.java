package com.publicept.components;

/**
 * ArrayModifierImpl
 * ArrayModifier implementation which provides Methods to alter arrays.
 *
 * reverseArray()
 *
 * @author created by Urs Albisser, on 2020-05-06
 * @version 0.1
 */
public class ArrayModifierImpl implements ArrayModifier {

	// == constructors ==

	/**
	 * ArrayModifierImpl()
	 */
	public ArrayModifierImpl() {
		// do nothing
	}

	// == public methods ==

	/**
	 * reverseArray()
	 * Reverse the order of integers in the array.
	 * @param array Array to be reversed
	 * @return reversed array
	 */
	/*
	My solution
	 */
	@Override
//	public int[] reverseArray(int[] array) {
//
//		int[] reverseArray = new int[array.length];
//		int maxIndex = array.length - 1;
//
//		for(int i=0; i<array.length; i++) {
//			reverseArray[i] = array[maxIndex];
//			maxIndex--;
//		}
//
//		return reverseArray;
//	}

	/*
	Tom's solution (adapted)
	 */
	public int[] reverseArray(int[] array) {

		/*
		* array.clone()
		* Arrays can be passed to a method just like normal variables. When an array is passed to a method as an argument,
		* actually the address of the array in the memory is passed (reference).
		* Therefore, any changes to this array within the method will affect the original array.
		* Hence, the passed array must be cloned to avoid overriding the original array passed as parameter.
		*/
		int[] reverseArray = array.clone();

		int maxIndex = reverseArray.length -1;
		int halfLength = reverseArray.length / 2;

		for(int i=0; i<halfLength; i++) {
			int temp = reverseArray[i];
			reverseArray[i] = reverseArray[maxIndex -i];
			reverseArray[maxIndex -i] = temp;
		}

		return reverseArray;
	}
}
