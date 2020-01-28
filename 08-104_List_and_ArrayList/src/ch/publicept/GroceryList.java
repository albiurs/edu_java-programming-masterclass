package ch.publicept;

import java.util.ArrayList;

/**
 * ch.publicept.GroceryList
 *
 * addGroceryItem(String item)
 * printGroceryList()
 * modifyGroceryItem(int i, String newItem)
 * removeGroceryItem(int i)
 * findItem(String searchItem)
 *
 * @author created by Urs Albisser, on 2020-01-28
 * @version 0.1
 */
public class GroceryList {



	// == fields ==
	// ArrayList<String> groceryList = new ArrayList<String>();
	// explicit type argument ArrayList<String>() can be replaced with ArrayList<>()
	// ArrayList<>() -> () brackets = call empty constructor of the ArrayLIst class.
	private ArrayList<String> groceryList = new ArrayList<>();



	// == public methods ==
	/**
	 * addGroceryItem()
	 * Add a new item to the ArrayList.
	 * @param item New item String to add
	 */
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}


	/**
	 * printGroceryList()
	 * Print the whole ArrayList to the console.
	 */
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list.");

		for(int i=0; i<groceryList.size(); i++)
			System.out.println((i+1) + ". " + groceryList.get(i));
	}


	/**
	 * modifyGroceryItem()
	 * Modifies the item at index i.
	 * @param i index
	 * @param newItem New String to replace the former item
	 */
	public void modifyGroceryItem(int i, String newItem) {
		groceryList.set(i, newItem); // i = index
		System.out.println("Grocery item " + (i +1) + " modified to " + newItem);
	}


	/**
	 * removeGroceryItem()
	 * Removes the item with index i form the ArrayList.
	 * @param i index
	 */
	public void removeGroceryItem(int i) {
		String theItem = groceryList.get(i); // i = index
		groceryList.remove(i);
		System.out.println("Grocery item " + (i +1) + " has been removed.");
	}


	/**
	 * findItem()
	 * Find item in the ch.publicept.GroceryList
	 * @param searchItem Item String to search for
	 * @return Item String is returned if found, otherwise null is returned
	 */
	public String findItem(String searchItem) {
		// Returns true if this list contains the specified element at least once.
		// Showcase only
		boolean itemExists = groceryList.contains(searchItem);

		// Returns the index of the first occurrence of the specified element in this list, or
		// Returns -1 if this list does not contain the element.
		int i = groceryList.indexOf(searchItem);

		if(i >= 0) {
			return groceryList.get(i);
		}
		return null;
	}
}
