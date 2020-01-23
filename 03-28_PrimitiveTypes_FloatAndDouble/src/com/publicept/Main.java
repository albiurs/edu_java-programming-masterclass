package com.publicept;

public class Main {

	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value: " + myMinFloatValue); // 1.4E-45
		System.out.println("Float maximum value: " + myMaxFloatValue); // 3.4028235E38

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value: " + myMinDoubleValue); // 4.9E-324
		System.out.println("Double maximum value: " + myMaxDoubleValue); // 1.7976931348623157E308

		int myIntValue = 5;
		//float myFloatValue = 5.15;  // error: double is default floating point data type in Java!
		float myFloatValue = 5.15f;  // must be declared by "f"
        float myFloatValueTwo = (float) 5.15;  // casted float (not recommended)
		double myDoubleValue = 5.25d;    // double = standard for floating point data type in Java
        double myDoubleValueTwo = 5.25;    // double = standard for floating point data type in Java
        double myDoubleValueThree = 5.00;    // double: x.00 > automatically double

        myIntValue = 5 / 3;
        myFloatValue = 5f / 3f;
        myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue); // 1
        System.out.println("MyFloatValue = " + myFloatValue); // 1.6666666
        System.out.println("MyDoubleValue = " + myDoubleValue); // 1.6666666666666667

        //kilo - pounds challenge
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237d;
		System.out.println("Converted Kilograms = " + convertedKilograms ); // 90.718474

		//pi
		double pi = 3.1415927d;
		double anotherNumber = 3_000_000.456_789_0d;
		System.out.println(pi); // 3.1415927
		System.out.println(anotherNumber); // 3000000.456789
	}
}
