/*********************
 Author: Marinel Tinnirello
 Lab 2 - Problem 1
 ********************/

import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number:        ");
		int a = input.nextInt();
		
		System.out.println("Please enter another number:  ");
		int b = input.nextInt();
		
		
		if(a < b)
		{
			System.out.println(a + " is LESS THAN " + b + "?" + "  true");
		}else
		{
			System.out.println(a + " is LESS THAN " + b + "?" + "  false");
		}
		if(a <= b)
		{
			System.out.println(a + " is LESS THAN OR EQUAL TO " + b + "?" + "  true");
		}else
		{
			System.out.println(a + " is LESS THAN OR EQUAL TO " + b + "?" + "  true");
		}
		if(a == b)
		{
			System.out.println(a + " is EQUAL TO " + b + "?" + "  true");
		}else
		{
			System.out.println(a + " is EQUAL TO " + b + "?" + "  false");
		}
		if (a != b)
		{
			System.out.println(a + " is NOT " + b + "?" + "  true");
		}else
		{
			System.out.println(a + " is NOT " + b + "?" + "  false");
		}
		if(a > b)
		{
			System.out.println(a + " is GREATER THAN THAN " + b + "?" + "  true");
		}else
		{
			System.out.println(a + " is GREATER THAN THAN " + b + "?" + "  false");
		}
		if(a >= b)
		{
			System.out.println(a + " is GREATER THAN OR EQUAL TO " + b + "?" + "  true");
		}else
		{
			System.out.println(a + " is GREATER THAN OR EQUAL TO " + b + "?" + "  false");
		}
	}

}
