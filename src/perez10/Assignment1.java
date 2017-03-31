//Created by Marco Perez
//Student ID: 2348837
package perez10;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// Creating a scanner object
		Scanner input = new Scanner(System.in);

		// Getting input from the user
		System.out.println("Enter the code pattern\r(Sample: AbCd1234abcXX0)");
		String userResponse = input.nextLine();

		// Validating if string uses 13 or 14 characters as the pattern allows
		// for 2 or 3 lower case letters
		if (userResponse.length() == 14) {
			// Validating that the pattern matches the requirements
			if (userResponse.matches("[A-Z][a-z][A-Z][a-z][\\d]{4}[a-z]{3}[A-Z]{2}[\\d]")) {
				// If it matches, print success message to console
				System.out.printf("Yes, %s matches the pattern", userResponse);
			} else
				System.out.println("Not a match");
		} else if (userResponse.length() == 13) {
			// Validating that the pattern matches the requirements (if only 2
			// lower case letters used)
			if (userResponse.matches("[A-Z][a-z][A-Z][a-z][\\d]{4}[a-z]{2}[A-Z]{2}[\\d]")) {
				// Prints successful message to console if patter matches
				System.out.printf("Yes, %s matches the pattern", userResponse);
			} else
				System.out.println("Not a match");
		}
		// Display error message if the number of characters is incorrect
		else
			System.out.println("Not a valid pattern");

		input.close();

	}

}
