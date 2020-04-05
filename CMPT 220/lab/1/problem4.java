/*********************
 Author: Marinel Tinnirello
 Lab 1 - Problem 4
 ********************/

import java.util.Scanner;

public class Problem3 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a mass:   ");
		
		double mass = input.nextDouble();
		double energy = mass * Math.pow(299972458,2);
		
		System.out.println("Energy:   " + energy);
	}
}
