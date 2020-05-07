package com.publicept.service;

/**
 * ArrayModifierImpl
 *
 * @author created by Urs Albisser, on 2020-05-06
 * @version 0.1
 */
public class ArrayModifierImpl implements ArrayModifier {

	// == public methods ==
	@Override
	public int[] reverseArray(int[] array) {

		int[] reverseArray = new int[array.length];
		int lowElementCounter = 0;
		int highElementCounter = array.length - 1;


		for(int i=0; i<array.length; i++) {
			reverseArray[i] = array[highElementCounter];
			highElementCounter--;
		}

		return reverseArray;
	}
}
