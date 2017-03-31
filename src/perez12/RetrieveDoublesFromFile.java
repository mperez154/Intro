//Created by Marco Perez
//Student ID: 2348837
package perez12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RetrieveDoublesFromFile {

	public static void main(String[] args) {

		File myFile = new File("doubles.txt");
		double total = 0;

		try (Scanner input = new Scanner(myFile);) {
			while (input.hasNext()) {
				double value = input.nextDouble();
				System.out.println("Value: " + value);
				total += value;
			}

			System.out.printf("\nThe total is %5.2f", total);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
