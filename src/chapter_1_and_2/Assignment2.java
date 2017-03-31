//Project by Marco Perez
//SPC Student ID: 2348837

package chapter_1_and_2;

//Used to allow user input
import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		//Declare variables
		int numerator;
		int denominator;
		
		//Create new scanner object
		Scanner input = new Scanner(System.in);
		
		//Get user input here
		System.out.println("Please enter your numberator:");
		numerator = input.nextInt();
		System.out.println("Please enter your denominator:");
		denominator = input.nextInt();
		
		//Calculations performed here
		int wholeNumber = numerator / denominator; 
		int remainder = numerator % denominator;
		
		//Output the results of the calculations
		System.out.print("Thanks you. " + numerator + " divided by " + denominator + " is equal to: ");
		System.out.println(wholeNumber + " and " + remainder + "/" + denominator);
		
		/*	Was getting a resource leak from Eclipse indicating the scanner input wasn't closed. 
		 *	Found this solution online via stackoverflow website. 
		 *	http://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed
		 */
		input.close();
	}
}
