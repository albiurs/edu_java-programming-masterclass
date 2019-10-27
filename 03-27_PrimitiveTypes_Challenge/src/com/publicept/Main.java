package com.publicept;

public class Main {

    public static void main(String[] args) {
	    byte byteValue = 10;
	    short shortValue = 100;
	    int intValue = 1000;
	    //long longTotal = 30_00_000_000L + 10 * ((long) byteValue + (long) shortValue + (long) intValue); // solution 1
		long longTotal = 30_00_000_000L + 10L * (byteValue + shortValue + intValue);	// solution 2: best!
		//long longTotal = 30_00_000_000L + 10 * (byteValue + shortValue + intValue); // solution 3
		System.out.println("Long Total: " + longTotal);

		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));	// must be casted
		System.out.println("Short Total: " + shortTotal);

    }
}
