package chapter3;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int age;
		int citizen;
		
		System.out.println("Please enter your age:");
		age = input.nextInt();
		
		
		if (age > 18)
		{
			System.out.println("Thank you, are you a citizen? Enter 1 for yes, 2 for no");
			citizen = input.nextInt();
			if (citizen == 1)
			{
				System.out.println("YES"); 
			}
			else 
			{
				System.out.println("NO"); 
			}
		}
		else 
		{
			System.out.println("NO 2"); 
		}
		
		input.close();
		

	}

}
