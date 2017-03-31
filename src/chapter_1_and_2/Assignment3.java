//Project by Marco Perez
//SPC Student ID: 2348837

package chapter_1_and_2;

//Allows user input
import java.util.Scanner;

public class Assignment3 
{
	public static void main(String[] args) 
	{
		//Declare and initialize variables
		final int CUSTOMER_CASH = 100;	// In cents or pennies
		int change; 
		
		//Create new scanner object
		Scanner input = new Scanner(System.in);
		
		//Get input from user
		System.out.println("Please enter a purchase price:");
		int purchasePrice = input.nextInt();
		
		//Perform calculations here
		change = CUSTOMER_CASH - purchasePrice; 
		int quarters = change / 25;
		int remainingChange = change % 25;
		
		int dimes = remainingChange / 10;
		remainingChange = remainingChange % 10;
		
		int nickels = remainingChange / 5;
		remainingChange = change % 5;
		
		int pennies = remainingChange / 1;
		
		System.out.println("Your change is " + change + " cents!");
		System.out.println("You get " + quarters + " quarter(s),");
		System.out.println("You get " + dimes + " dimes(s),");
		System.out.println("You get " + nickels + " nickels(s),");
		System.out.println("You get " + pennies + " pennies(s).");

		/*	Was getting a resource leak from Eclipse indicating the scanner input wasn't closed. 
		 *	Found this solution online via stackoverflow website. 
		 *	http://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed
		 */
		input.close();
	}
}
