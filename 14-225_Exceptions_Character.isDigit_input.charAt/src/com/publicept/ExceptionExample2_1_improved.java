package com.publicept;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * New terms:
 * - Stack Trace:	Whole output in the case of a crash: thread + call stack.
 * 					The Stack Trace is filled in by the java.lang.Throable's constructor.
 * - Call Stack:	List of all method calls at any particular point in a program's execution.
 * 			In the case of an exception, it's all the method call at the point where the program crashed.
 * 			Each thread of execution has it's own call stack.
 * - Thread: The thread is shown as the first line of the stack trace. Every time a new method is called,
 * 			it's actually placed onto the stack. And when a method returns, it's removed from the stack.
 *
 * 	READ & INTERPRET THE STACK TRACE:
 * 	1. Thread in line 1
 * 	2. Call Stack
 * 		-> start at the bottom and work back up
 * 		-> line on the bottom is the first line, causing the crash.
 */
public class ExceptionExample2_1_improved {

	public static void main(String[] args) {

		try {
			int result = divide();
			System.out.println(result);
		// | is a bit wise inclusive or (not a logical or), which is the way to check for multiple exceptions!
		} catch (ArithmeticException | NoSuchElementException e) {
			// Provide reasonable information to the user by printing out the returned exception from divide(),
			// without letting the program to crash.
			System.out.println(e.toString());
			System.out.println("Unable to perform division, autopilot shutting down...");
		}
	}

	private static int divide() {

		int x, y;

//		try {
			x = getInt();
			y = getInt();
			System.out.println("x is " + x + ", y is " + y);
			return x / y;
//		} catch (NoSuchElementException e) {
//			throw new NoSuchElementException("No suitable input!");
//		} catch (ArithmeticException e) {
//			throw new ArithmeticException("Attempt to divide by 0!");
//		}
	}

	/**
	 * This way of implementing return s.nextInt() to get an Input is just for demonstration purpose!
	 * DO NOT USE IN REAL PROGRAMS, THERE ARE BETTER WAYS!
	 */
	private static int getInt() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		while (true) {
			try {
				return s.nextInt();
			} catch (InputMismatchException e) {
				// go 'round again. Read past end of line in the input first
				s.nextLine();
				System.out.println("The input was not an integer.");
				System.out.println("Please enter a number using only the digits 0 to 9: ");
			}
		}
	}
}
