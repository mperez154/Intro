//Created by Marco Perez
//Student ID: 2348837
package perez7and8;

import java.util.Arrays;

public class AssignmentOne {

	public static void main(String[] args) {
		// Declaring array
		int[] myArray = new int[10];

		// For loop that is assigning random values between 100-200 to array
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) ((Math.random() * 101) + 100);
		}

		// Command to sort array
		java.util.Arrays.sort(myArray);
		
		//Removed previous code and updated with Arrays class output 06/12/16
		System.out.print(Arrays.toString(myArray) + "\n");
		
		// New array named "doubled" that initiates elements by using the
		// doubleValue method below with myArray as the argument/parameter
		int[] doubled = doubleValues(myArray);
		int total = 0;

		// For loop used to display doubled values, and sum values of all
		// elements
		for (int i = 0; i < doubled.length; i++) {
			total += doubled[i];
			System.out.print(doubled[i] + " ");
		}

		// Converting int total to String so that I can add a comma between the
		// hundreds values and thousands values
		String newTotal = total + "";
		System.out.println("\n" + newTotal.charAt(0) + "," + newTotal.substring(1));

	}

	// Method that doubles values of array, returns doubledValues
	public static int[] doubleValues(int[] myParameter) {
		// New array
		int[] doubledValues = new int[myParameter.length];
		// For loop that is taking values or myParameter and doubling them
		for (int i = 0; i < myParameter.length; i++) {
			doubledValues[i] = myParameter[i] * (2);
		}
		return doubledValues;
	}
}
