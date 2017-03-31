//Created by Marco Perez
//Student ID: 2348837
package perez12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class RandomDoublesToFile {

	public static void main(String[] args) {
		// Creating file object
		File myFile = new File("doubles.txt");
		// Try-Catch
		try {
			// Creating PrintWriter object
			PrintWriter out = new PrintWriter(myFile);
			// Using for loop to generate 10 random doubles
			for (int i = 0; i < 10; i++) {
				out.println((double) ((Math.random() * 10) + 1));
				// Outputting contents of elements for testing, but this line
				// can be removed
			}
			System.out.println("File was created");
			// Closing PrintWriter object
			out.close();
		} catch (IOException e) {
			// Exception Message
			System.out.println(e.getMessage());
		}

	}

}
