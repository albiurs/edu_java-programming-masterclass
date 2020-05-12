package com.publicept.service;

/**
 * ArrayService
 *
 * @author created by Urs Albisser, on 2020-05-07
 * @version 0.1
 */
public interface ArrayService {


	// == public methods ==
	void printReverseIntegerArray();
	void printInitNumbersArray();


	// == getter & setter ==
	int[] getInitNumbersArray();
	void setInitNumbersArray();
	void setInitNumbersArray(int[] initNumbersArray);

	int[] getReverseArray();
	void setReverseArray();
	void setReverseArray(int[] numbersArray);


}
