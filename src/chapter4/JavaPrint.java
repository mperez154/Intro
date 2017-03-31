//Created by Marco Perez
//SPC Student ID: 2348837
package chapter4;

//This program prints 'Java' on one line using characters instead of strings, in Unicode (Exercise 2)
public class JavaPrint {

	public static void main(String[] args) 
	{
		//Unicode values found on wikipedia site: https://en.wikipedia.org/wiki/List_of_Unicode_characters
		//Declare and initialize variables
		char J = '\u004A';
		char a = '\u0061';
		char v = '\u0076';
		
		//Output to console 
		System.out.print(J);
		System.out.print(a);
		System.out.print(v);
		System.out.print(a);
	}

}
