package com.publicept;

import javax.sound.midi.Soundbank;

public class Main {

	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value: " + myMinFloatValue);
		System.out.println("Float maximum value: " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value: " + myMinDoubleValue);
		System.out.println("Double maximum value: " + myMaxDoubleValue);

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
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //kilo - pounds challenge
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237d;
		System.out.println("Converted Kilograms = " + convertedKilograms );

		//pi
		double pi = 3.1415927d;
		double anotherNumber = 3_000_000.4_567_890d;
		System.out.println(pi);
		System.out.println(anotherNumber);
	}
}
