package chapter3;

//Allows user input
import java.util.Scanner;

public class Teenager {

	public static void main(String[] args) 
	{
		//Creating a scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring variable used for user age
		int age;
		
		//Getting user age via input/scanner object
		System.out.println("Please enter your age:");
		age = input.nextInt();
		
		/*
		 * Performing calculations using if statements
		/* And outputting results
		*/
		if (age > 12 && age < 20)
		{
			System.out.println("You are a teenager");
		}
		else 
		{
			System.out.println("You are NOT a teenager");
		}
		
		//Closing scanner input
		input.close();

	}

}
