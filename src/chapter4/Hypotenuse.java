//Created by Marco Perez
//SPC Student ID: 2348837

//This program will calculate the hypotenuse of a triangle (Exercise 1)
package chapter4;

public class Hypotenuse {

	public static void main(String[] args) 
	{
		// declare and initialize variables
		int lineBC = 5; //Used static values instead of prompting user
		int lineAB = 12;	//Used static values instead of prompting user		
		//Calculating side b as the square root of (a squared) times (b squared)
		double lineAC = Math.sqrt((lineBC*lineBC)+(lineAB*lineAB));
		
		//Processing values using Java.math methods/functions
		double A = Math.toDegrees(Math.acos(lineBC/lineAB));
		double C = Math.toDegrees(Math.atan(lineAB/lineBC));
		
			
		//Outputting results to user
		System.out.printf("Side AC is %2.0f\n\n",lineAC);	//Added carriage returns to increase readability
		System.out.printf("Angle C is %5.3f", C);
		System.out.println(" degrees\n");
		System.out.printf("Angle A is %5.3f",A);
		System.out.println(" degrees\n");
				
	}
}

