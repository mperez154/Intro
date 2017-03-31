//Created by Marco Perez
//SPC Student ID: 2348837

package chapter4;

//Allows user input
import java.util.Scanner;

//This program takes users full name and outputs their f_name  and l_name on a single line (Exercise 3)
public class StringManipulation 
{
	public static void main(String[] args) 
	{
		//Creating a scanner object
		Scanner input = new Scanner(System.in);
		
		//Initialize and Declare variables
		String fullName;
		
		//Getting input from user
		System.out.println("Enter your full name.");
		fullName = input.nextLine();
		
		//Tracking down space between first and last name
		int spaces = fullName.indexOf(' ');
		
		//Creating strings to separate first name and last name
		String f_name = fullName.substring(0, spaces);
		String l_name = fullName.substring(spaces + 1);
		
		//Outputting requirements to console
		
		//Displaying full name in all caps
		System.out.println("Uppercase: " + fullName.toUpperCase());
		
		//Displaying length of full name
		System.out.println("Length full name: " + fullName.length());
		
		//Displaying length of first name
		System.out.println("Length first name: " + f_name.length());
		
		//Displaying length of last name
		System.out.println("Length last name: " + l_name.length());
		
		//Displaying name in usual alphabetical manner (last name, first name)
		System.out.println("Last Name First: " + l_name + ", " + f_name);
		
		//Displaying initials
		System.out.println("Initials: " + fullName.substring(0,1) + fullName.substring(spaces + 1, spaces + 2));

		input.close();
	}

}
