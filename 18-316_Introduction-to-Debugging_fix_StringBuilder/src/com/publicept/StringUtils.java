package com.publicept;

/**
 * StringUtils
 * Provides methods to manipulate Strings.
 *
 * addChar()
 *
 * @author created by Urs Albisser, on 2020-02-12
 * @version 0.1
 */
public class StringUtils {



	// == fields ==
	/*
	StringBuilder
	java.lang built-in class which assembles a mutable sequence of characters. to a String.
	 */
//	private StringBuilder stringBuilder = new StringBuilder();
	private int charsAdded = 0;



	// == public methods ==
	/**
	 * addChar()
	 * Add a char to to StringBuilder.
	 * @param stringBuilder StringBuilder instance
	 * @param charToBeAdded Character to be added to the String
	 */
	public void addChar(StringBuilder stringBuilder, char charToBeAdded) {
		stringBuilder.append(charToBeAdded);
		charsAdded ++;
	}


	public String upperAndPrefix(String str) {
		String upper = str.toUpperCase();
		return "Prefix__" + upper;
	}


	public String addSuffix(String str) {
		return str + "__Suffix";
	}
}
