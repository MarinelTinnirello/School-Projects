/*********************
 Author: Marinel Tinnirello
 Lab 1 - Problem 3
 ********************/

import java.util.Scanner;

public class Problem3 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value (in ounces):   ");
		
		double ounces = input.nextDouble();
		double grams = ounces * 28.3495;
		
		System.out.println("Grams:   " + grams);
	}
}
