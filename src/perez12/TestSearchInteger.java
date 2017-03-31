//Created by Marco Perez
//Student ID: 2348837
package perez12;

public class TestSearchInteger {

	public static void main(String[] args) {

		// Creating an object from the SearchInteger class
		SearchInteger myObject = new SearchInteger();

		// Creating an array with 10 elements
		int[] myArray = new int[10];

		// Adding values to all 10 elements by using a for loop
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 10);
		}

		// Executing search method inside the SearchInteger class
		// Passing arguments for array and search value
		myObject.search(myArray, 5);

	}

}
