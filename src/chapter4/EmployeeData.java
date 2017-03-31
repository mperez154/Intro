//Created by Marco Perez
//SPC Student ID: 2348837

package chapter4;

//This application ouptuts employee data to the console (Exercise 4)
public class EmployeeData {

	public static void main(String[] args) 
	{
		//Declaring and initializing variables using data provided
		String name = "George";
		int age = 29;
		double hourlyPay = 48.50;
		char office = 'C';
		
		//Three statements to console using printf
		System.out.printf("%s is %d years old\n", name, age);
		System.out.printf("He works in office %s\n", office);
		System.out.printf("In a 40-hour week, his gross pay is $%7.2f\n\n",(hourlyPay*40));	//Added CR to increase readability
	}

}
