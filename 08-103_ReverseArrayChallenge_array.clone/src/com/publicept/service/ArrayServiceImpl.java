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

		System.out.print("reverseArray: ");
		for(int i=0; i<reverseArray.length; i++) {
			System.out.print(reverseArray[i] + " ");
		}
		System.out.println();
	}

	/**
	 * printInitNumbersArray()
	 * Print the array initNumbersArray to the console.
	 */
	@Override
	public void printInitNumbersArray() {

		System.out.print("initNumbersArray: ");
		for(int i = 0; i< initNumbersArray.length; i++) {
			System.out.print(initNumbersArray[i] + " ");
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
		/*
		 * arrayModifier.reverseArray(numbersArray)
		 * -> array.clone()
		 * Arrays can be passed to a method just like normal variables. When an array is passed to a method as an argument,
		 * actually the address of the array in the memory is passed (reference).
		 * Therefore, any changes to this array within the method will affect the original array.
		 * Hence, the passed array must be cloned to avoid overriding the original array passed as parameter.
		 */
		this.reverseArray = arrayModifier.reverseArray(numbersArray);
	}
}
