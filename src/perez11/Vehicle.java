//Created by Marco Perez
//Student ID: 2348837
package perez11;


public class Vehicle 
{
	public static void main(String[] args)
	{
				

		// Creating an array with 10 elements
		int[] myArray = new int[10];

		// Adding values to all 10 elements by using a for loop
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 10);
		}

		// Executing search method inside the SearchInteger class
		// Passing arguments for array and search value
		search(myArray, 5);

		
	}
	public static void search(int[] arrayData, int searchNum) 
	{
		// Using try-catch to catch any exceptions
		try {
			// Creating an array and int to use as arguments for the method
			int[] myArray2 = arrayData;
			int searchValue = searchNum;
			boolean match = false;
			
			// For statement that will search the array for the value passed as
			// an argument
			for(int i = 0; i < myArray2.length; i++) 
			{
				if (searchValue == myArray2[i]) 
				{
					match = true;	
				}
			}
			if(match == false)
				throw new Exception();
		} 
		catch (Exception a) 
		{
			// Exception message
			System.out.println("Element not found in array");
		}
	}
	
	


}
