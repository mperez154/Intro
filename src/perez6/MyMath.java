//Created by Marco Perez
//Student ID: 2348837
package perez6;

import java.util.Scanner;

public class MyMath {

	public static void main(String[] args) 
	{
		//Creating scanner object
		Scanner input = new Scanner(System.in);
		
		//Getting input from user
		System.out.println("Enter two double numbers");
		double firstNumber = input.nextDouble();
		double secondNumber = input.nextDouble();
		
		//using the Total_Diff method with values from user	
		totalDiff(firstNumber,secondNumber);
	
		//Using the product method with values from user	
		System.out.println(firstNumber + " times " + secondNumber + " = " + product(firstNumber,secondNumber));
		
		//using this if statement to ensure the numbers are displayed in the correct order below
		if (firstNumber < secondNumber)
		{
			double temp = secondNumber;
			secondNumber = firstNumber;
			firstNumber = temp;
		}
		
		//Using the quotient method with values from user
		System.out.printf("%4.3f divided by %4.3f = %4.3f", firstNumber, secondNumber, quotient(firstNumber, secondNumber));
		
		input.close();
	}
	
	//Method called Total_Diff
	public static void totalDiff(double a, double b)
	{
		//Output total of the two arguments
		System.out.println("The total of " + a + " and " + b + " is " + (a+b));
		
		//If statement to ensure the difference is calculated correctly
		if (a < b)
		{
			double temp = b;
			b = a;
			a = temp;
		}
		
		//Output the difference between a and b
		System.out.println("The positive difference between " + a + " and " + b + " is " + (a-b));
		
	}
	
	//Method called Product
	public static double product(double a, double b)
	{
		return a*b;
	}
	
	//Method called quotient
	public static double quotient(double a, double b)
	{
		//If statement to ensure the larger number is divided properly
		if (a < b)
		{
			double temp = b;
			b = a;
			a = temp;
		}
		
		return a/b;	
	}

}
