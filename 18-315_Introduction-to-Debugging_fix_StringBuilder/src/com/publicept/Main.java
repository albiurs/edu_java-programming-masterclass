package com.publicept;

/**
 * com.publicept.Main
 * Buggy application for testing the IDEA's debug functions.
 *
 * @author created by Urs Albisser, on 2020-02-12
 * @version 0.1
 */
public class Main {

	/**
	 * main()
	 * @param args Args
	 */
	public static void main(String[] args) {

		StringUtilities stringUtilities = new StringUtilities();
		/*
		StringBuilder
		java.lang built-in class which assembles a mutable sequence of characters. to a String.
		 */
		StringBuilder stringBuilder = new StringBuilder();

		while (stringBuilder.length() < 10) {
			stringUtilities.addChar(stringBuilder, 'a');
		}

		System.out.println(stringBuilder);
	}
}
