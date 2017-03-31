//Created by Marco Perez
//Student ID: 2348837
package perez6;

import java.util.Scanner;

public class OverLoading {

	public static void main(String[] args) 
	{
		//Creating scanner object
		Scanner input = new Scanner(System.in);
		
		//Getting input for two integers from user
		System.out.println("Please enter two an integers");
		int integerOne = input.nextInt();
		int integerTwo = input.nextInt();
		
		//Running the math method below which uses two integer arguments 
		System.out.println(math(integerOne, integerTwo));
		
		//Getting input from to double numbers from user
		System.out.println("Please enter two double numbers");
		double doubleOne = input.nextDouble();
		double doubleTwo = input.nextDouble();
		
		//Running the overloaded math method using two double numbers for arguments
		System.out.println(math(doubleOne, doubleTwo));
		
		input.close();

	}
	//First method using int for the return type
	public static int math(int a, int b)
	{
		return a+b;
	}
	//Overloaded math method returning the double type
	public static double math(double a, double b)
	{
		return a+b;
	}
}
