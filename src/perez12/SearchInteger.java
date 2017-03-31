//Created by Marco Perez
//Student ID: 2348837
package perez12;

public class SearchInteger {

	// No constructor created in this class

	public void search(int[] arrayData, int searchNum) {
		// Using try-catch to catch any exceptions
		try {
			// Creating an array and int to use as arguments for the method
			int[] myArray2 = arrayData;
			int searchValue = searchNum;
			boolean match = false;

			// For statement that will search the array for the value passed as
			// an argument
			for (int i = 0; i < myArray2.length; i++) {
				// If value is found, then the system will output the statement
				// below and change match to true
				if (searchValue == myArray2[i]) {
					match = true;
					System.out.println("Match on element " + i);
				}
			}
			// If match not true, then exception will occur
			if (match == false)
				throw new Exception();
		} catch (Exception a) {
			// Exception message
			System.out.println("Element not found in array");
		}
	}

}
