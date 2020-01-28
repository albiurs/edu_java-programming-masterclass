package ch.publicept;

import javax.swing.*;
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
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem);
	}


	/**
	 * removeItem()
	 */
	public static void removeItem() {
		System.out.print("Enter item number to remove: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo-1);
	}


	/**
	 * searchForItem()
	 */
	public static void searchForItem() {
		System.out.print("Item to search for: ");
		String searchItem = scanner.nextLine();
		if(groceryList.findItem(searchItem) != null) {
			System.out.println("Found " + searchItem + " in  our grocery list");
		} else {
			System.out.println(searchItem + " is not in the shopping list");
		}
	}
}
