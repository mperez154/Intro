//Created by Marco Perez
//Student ID: 2348837

package perez6;

import java.util.Scanner;

//Program that manipulates user input
public class StringApplication {

	public static void main(String[] args) 
	{
		//Creating a scanner object
		Scanner input = new Scanner(System.in);
		
		//Getting input from user
		System.out.println("Enter your name, please");
		String name = input.nextLine();
		
		System.out.print(stringer(name));
		System.out.println(" characters");	//To look like the sample, adding the word 'characters' at the end of the statement. 
		input.close();

	}
	
	//Changed the code to return a string value, not void as before
	public static int stringer(String a)
	{
		//Tracking down space between first and last name
		int spaces = a.indexOf(' ');
				
		//Creating strings to separate first name and last name
		String f_name = a.substring(0, spaces);
		String l_name = a.substring(spaces + 1);
				
		//Outputting last name, first name
		System.out.println("Alphabetically your name is " + l_name + ", " + f_name);
				
		//For loop that will display the name backwards
		System.out.print("Your name backwards is ");
		for (int i = a.length()-1; i >= 0; i--)
		{
			System.out.print(a.charAt(i));
		}
		//Statement before the name length is displayed
		System.out.print("\nYour name has ");
		
		//Added the return value of a.length and concatenated the word characters
		return a.length();
		//Updated method to return an integer (a.length) instead of a String like it was before. 
		
	}

}
