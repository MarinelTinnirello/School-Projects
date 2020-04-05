/*********************
 Author: Marinel Tinnirello
 Lab 2 - Problem 6
 ********************/

import java.lang.Math;

public class main {

	public static void main(String[] args) 
	{
		int a = (int)(Math.random() * (800) + 200);
		int b = (int)(Math.random() * (800) + 200);
		int c = (int)(Math.random() * (800) + 200);
		
		if(c < 1000 && c > 99)
		{
			System.out.println("(" + a + ")" + b + "-0" + c);
		}
		else if (c < 100 && c > 9)
		{
			System.out.println("(" + a + ") " + b + "-00" + c);
		}
		else if (c < 10)
		{
			System.out.println("(" + a + ") " + b + "-000" + c);
		}
		else
		{
			System.out.println("(" + a + ") " + b + "-" + c);
		}
	}
}
