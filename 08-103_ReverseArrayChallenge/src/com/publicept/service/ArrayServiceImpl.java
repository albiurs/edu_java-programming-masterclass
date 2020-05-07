package com.publicept.service;

import com.publicept.components.ArrayModifier;
import com.publicept.components.ArrayModifierImpl;
import com.publicept.components.IntReader;
import com.publicept.components.IntReaderImpl;

/**
 * ArrayServiceImpl
 *
 * public methods
 * printReverseIntegerArray()
 * printInitNumbersArray()
 *
 * getter & setter
 * not listed
 *
 * @author created by Urs Albisser, on 2020-05-07
 * @version 0.1
 */
public class ArrayServiceImpl implements ArrayService {

	// == fields ==
	private IntReader intReader;
	private ArrayModifier arrayModifier;

	private int[] initNumbersArray;
	private int[] reverseArray;



	// == constructors ==
	/**
	 * ArrayServiceImpl()
	 * Default constructor
	 */
	public ArrayServiceImpl() {
		this.intReader = new IntReaderImpl();
		this.arrayModifier = new ArrayModifierImpl();
		this.initNumbersArray = null;
		this.reverseArray = null;
	}



	// == public methods ==
	/**
	 * printReverseIntegerArray()
	 * Prints the array reverseArray to the console.
	 * reverseArray must be initialized first by calling the setReverseArray()
	 * or the setReverseArray(int[] numbersArray) method.
	 */
	@Override
	public void printReverseIntegerArray() {

		for(int i=0; i<reverseArray.length; i++) {
			System.out.print("reverseArray: " + reverseArray[i] + " ");
		}
		System.out.println();
	}

	/**
	 * printInitNumbersArray()
	 * Print the array initNumbersArray to the console.
	 */
	@Override
	public void printInitNumbersArray() {

		for(int i = 0; i< initNumbersArray.length; i++) {
			System.out.print("initNumbersArray: " + initNumbersArray[i] + " ");
		}
		System.out.println();
	}



	// == getter & setter ==
	@Override
	public int[] getInitNumbersArray() {
		return initNumbersArray;
	}

	@Override
	public void setInitNumbersArray() {
		int[] intArray = intReader.readIntegerArray();
		setInitNumbersArray(intArray);
	}

	@Override
	public void setInitNumbersArray(int[] initNumbersArray) {
		this.initNumbersArray = initNumbersArray;
	}

	@Override
	public int[] getReverseArray() {
		return reverseArray;
	}

	@Override
	public void setReverseArray() {
		setReverseArray(getInitNumbersArray());
	}

	@Override
	public void setReverseArray(int[] numbersArray) {
		reverseArray = arrayModifier.reverseArray(getInitNumbersArray());
	}
}
