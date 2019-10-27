package com.publicept;

public class Printer {

	/**
	 * Challenge
	 */
	// Create a class and demonstrate proper encapsulation techniques
	// the class will be called Printer
	// It will simulate a real Computer Printer
	// It should have fields for the toner Level, number of pages printed, and
	// also whether its a duplex printer (capable of printing on both sides of the paper).
	// Add methods to fill up the toner (up to a maximum of 100%), another method to
	// simulate printing a page (which should increase the number of pages printed).
	// Decide on the scope, whether to use constructors, and anything else you think is needed.

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel >= 0 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = -1;
		}
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}

	public int fillUpToner() {

		int fillCount = 0;

		while (tonerLevel < 100) {
			tonerLevel += 1;
			fillCount +=1;
		}

		System.out.println(fillCount + "% of toner added");
		System.out.println("Current toner level = " + getTonerLevel() + "%");
		return fillCount;
	}

	public int addToner(int tonerAmount) {
		if(tonerAmount > 0 && tonerAmount <= 100) {
			if(this.tonerLevel + tonerAmount >100) {
				System.out.println("Too much of toner added. Max. toner to be added = " + (100 - tonerLevel));
				return -1;
			} else {
				this.tonerLevel += tonerAmount;
			}
			System.out.println(tonerAmount + "% of toner added");
			System.out.println("Current toner level = " + getTonerLevel() + "%");
			return this.tonerLevel;
		} else {
			return -1;
		}
	}

	public int printPages(int pages) {

		System.out.println("Printer.printPage() called");
		int pagesToPrint = pages;
		this.tonerLevel -= (pages * 1);

		if(this.duplex) {
			System.out.println("printing in duplex mode.");
			pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
		}
		System.out.println("printing...");
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}
}
