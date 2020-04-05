/*********************
 Author: Marinel Tinnirello
 Lab 2 - Problem 5
 ********************/

import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string:        ");
		String a = input.nextLine();
		
		System.out.println("Please enter another string:  ");
		String b = input.nextLine();
		
		if(a.compareTo(b) < 0) 
		{
			System.out.println(a + "\n" + b);
		}
		else
		{
			System.out.println(b + "\n" + a);
		}
	}
}
