/*********************
 Author: Marinel Tinnirello
 Lab 2 - Problem 2
 ********************/

import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String[] arr = {"January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November","December"};
		
		System.out.println("Please enter a number that corresponds to a month:  ");
		int a = input.nextInt();
		
		if(a > 0 && a < 13)
		{
			System.out.println(arr[a-1]);
		}
		else
		{
			System.out.println("That not a number which could be used.");
		}
	}
}
