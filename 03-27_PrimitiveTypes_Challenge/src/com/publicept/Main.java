package com.publicept;

public class Main {

    public static void main(String[] args) {

    	// == fields ==
	    byte byteValue = 10;
	    short shortValue = 100;
	    int intValue = 1000;

		// = 3000011100 - solution 1
	    long longTotal = 30_00_000_000L + 10 * ((long) byteValue + (long) shortValue + (long) intValue);
		System.out.println("Long Total 1: " + longTotal);

		// BEST SOLUTION!
		// = 3000011100 - solution 2:
		longTotal = 30_00_000_000L + 10L * (byteValue + shortValue + intValue);
		System.out.println("Long Total 2: " + longTotal);

		// = 3000011100 - solution 3
		longTotal = 30_00_000_000L + 10 * (byteValue + shortValue + intValue);
		System.out.println("Long Total 3: " + longTotal);

		// short must be casted
		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
		System.out.println("Short Total: " + shortTotal);
    }
}
