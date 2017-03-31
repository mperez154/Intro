//Created by Marco Perez
//Student ID: 2348837
package perez7and8;

import java.util.Arrays;

public class AssignmentTwo {

	public static void main(String[] args) {

		// System out, returning sumArguments with 3 arguments
		System.out.println("Sum is " + sumArguments(10,20,30,40,50,60));

	}

	// Method that takes a variable number of arguments and returns the sum
	public static int sumArguments(int... myArgs) {

		// Variable used to sum all the elements
		int sum = 0;

		// For statement used to sum all the elements within the Array
		for (int i = 0; i < myArgs.length; i++) {
			sum += myArgs[i];
		}
		// System.out.println that displays variable input as string
		System.out.println("Passing " + Arrays.toString(myArgs));

		return sum;
	}

}
