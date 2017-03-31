//Project by Marco Perez
//SPC Student ID: 2348837

package chapter_1_and_2;

//Used to accept user input
import java.util.Scanner;

public class Assignment1 
{
	public static void main(String[] args) 
	{
		//Declare and initialize variables
		final double TAX = 0.07;
		double unitPrice;
		int quantity;
		double subTotal;
		double salesTax;
		double totalPrice;
		
		//Creating scanner/input object called input
		Scanner input = new Scanner(System.in);
		
		//Getting user input (Unit price and quantity)
		System.out.println("Please enter the merchandise price:");
		unitPrice = input.nextDouble();
		System.out.println("Thank you, now enter the quantity:");
		quantity = input.nextInt();
		
		//Performing calculations
		subTotal = unitPrice * quantity;
		salesTax = subTotal * TAX;
		totalPrice = subTotal + salesTax;
		
		//Outputting answer to user
		System.out.println("Thank You, your bill is \nSub Total: " + subTotal + "\nTax: " + salesTax + "\nTotal: " + totalPrice);
		
		/*	Was getting a resource leak from Eclipse indicating the scanner input wasn't closed. 
		 *	Found this solution online via stackoverflow website. 
		 *	http://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed
		 */
		input.close();
	}

}
