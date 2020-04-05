/*********************
 Author: Marinel Tinnirello
 Lab 2 - Problem 4
 ********************/

import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a character:        ");
		char a = input.next().charAt(0);
		
		System.out.println("Please enter another character:  ");
		char b = input.next().charAt(0);
		
		int c = (int)(a + b);
		
		System.out.println("Sum:  ");
	}
}
