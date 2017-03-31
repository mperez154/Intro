//Created by Marco Perez
//Student ID: 2348837

package perez7and8;

public class AssignmentThree {

	public static void main(String[] args) {
		// Creating two dimensional array
		double[][] myDoubleArray = { { 1.25, 2.25, 3.25 }, { 1.50, 2.50, 3.50 }, { 1.75, 2.75, 3.75 } };

		// Outputting initial comment
		System.out.println("Here is the array");
		// Nested for loop to display two dim array info
		for (int i = 0; i < myDoubleArray[0].length; i++) {
			for (int j = 0; j < myDoubleArray.length; j++) {
				// System.out.print(myDoubleArray[i][j] + "\t");
				//Updated to be left aligned with the minus sign, removed the extra spaces
				System.out.printf("%-8.2f", myDoubleArray[i][j]);
			}
			System.out.println(); // Carriage return at end of inner loop
		}
	}
}
