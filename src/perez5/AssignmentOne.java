//Created by Marco Perez
//Student ID: 2348837

package perez5;

import java.util.Scanner;

//Program is asking user for integers, then finding the average
public class AssignmentOne {

	public static void main(String[] args) 
	{
		//Creating scanner object
		Scanner input = new Scanner(System.in);
		
		//Initializing and declaring variables
		int count = -1;
		int total = 0;
		
		//Creating a for loop to add sum of user input
		for (int i = -1; i != 0; total += i)
		{
			//Getting user input
			System.out.println("Enter an integer or 0 to quit");
			i = input.nextInt();
			//Incrementing the count
			count++;		
		}
		
		//Calculate average (used the input provided by Professor Yourth 06/05
		double average = (double)total/count;
			
		//Outputting results to the console
		System.out.printf("The total of those %d numbers is %d\n", count,total);
		System.out.printf("The average is %5.3f", average);
		input.close();

	}

}
