/*********************
 Author: Marinel Tinnirello
 Lab 2 - Problem 3
 ********************/

import java.util.Scanner;
import java.lang.Math;

public class main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number that acts as a lower limit:   ");
		int a = input.nextInt();
		
		System.out.println("Please enter a number that acts as an upper limit:  ");
		int b = input.nextInt();
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println((int)(Math.random() * ((b - a) + 1)) + i);
		}
	}
}
