//Created by Marco Perez
//Student ID: 2348837

package perez5;

//Program that displays ASCII characters using nested loops
public class AssignmentThree {

	public static void main(String[] args) {
		int counter = 1;
		// Loop
		for (char asciiCharacters = 43; asciiCharacters < 121; asciiCharacters++) {
			// I was unable to figure out how to get a nested loop to work, so I
			// used an if statement to accomplish the same thing
			if ((asciiCharacters - (counter * 15)) % 43 == 0) {
				System.out.println();
				counter++;
			}
			System.out.printf("%s  ", asciiCharacters);
		}
	}
}
