package ch.publicept;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ch.publicept.Main
 *
 * main(String[] args)
 *
 * printInstructions()
 * addItem()
 * modifyItem()
 * removeItem()
 * searchForItem()
 * processArrayList()
 *
 * @author created by Urs Albisser, on 2020-01-27
 * @version 0.1
 */
public class Main {



	// == fields ==
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();



	// == public methods ==
	/**
	 * main()
	 * @param args args
	 */
	public static void main(String[] args) {

		boolean quit = false;
		int choice = 0;
		printInstructions();

		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					groceryList.printGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6:
					processArrayList();
				case 7:
					quit = true;
					break;
				default:
					// do nothing
			}
		}
	}


	/**
	 * printInstructions()
	 */
	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To quit the application.");
	}


	/**
	 * addItem()
	 */
	public static void addItem() {
		System.out.print("Please enter the grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());
	}


	/**
	 * modifyItem()
	 */
	public static void modifyItem() {
		System.out.print("Enter item number: ");
		String currentItem = scanner.nextLine();

		System.out.print("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(currentItem, newItem);
	}


	/**
	 * removeItem()
	 */
	public static void removeItem() {
		System.out.print("Enter an item name to remove: ");
		String item = scanner.nextLine();
		groceryList.removeGroceryItem(item);
	}


	/**
	 * searchForItem()
	 */
	public static void searchForItem() {
		System.out.print("Item to search for: ");
		String searchItem = scanner.nextLine();
		if(groceryList.isItemInList(searchItem)) {
			System.out.println("Found " + searchItem + " in  our grocery list");
		} else {
			System.out.println(searchItem + " is not in the shopping list");
		}
	}


	/**
	 * processArrayList()
	 * Showcase of several ArrayList copy and initialization concepts.
	 * Showcase of ArrayList-to-Array conversion.
	 */
	public static void processArrayList() {
		// 1. create new ArrayList
		ArrayList<String> newArrayList = new ArrayList<>();

		/*
		 * ArrayList.addAll(anotherArrayList)
		 */
		// 2. copy the full groceryList's entire contents to the new arrayList
		newArrayList.addAll(groceryList.getGroceryList());

		/*
		 * ArrayList<String> arrayList = new ArrayList<>(initializeWithAnotherArrayList);
		 */
		// initialize the ArrayList directly with the groceryList's contents
		ArrayList<String> nextArrayList = new ArrayList<>(groceryList.getGroceryList());

		/*
		 * String[] array = new String[anyArray.size()];
		 */
		// copy the groceryList's entire contents to a regular array
		// initialize the array directly with the groceryList's size
		String[] myArray = new String[groceryList.getGroceryList().size()];

		/*
		 * ArrayList.toArray(arrayToConvert)
		 */
		myArray = groceryList.getGroceryList().toArray(myArray);
	}
}
