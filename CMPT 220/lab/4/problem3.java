/*********************
 Author: Marinel Tinnirello
 Lab 4 - Problem 3
 ********************/

import java.util.Scanner;

public class myString
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s;
        //String rev = "";

        System.out.print("Enter a string:   ");
        s = input.nextLine();

        if(isPalindrome(s))
        {
            System.out.println(s + " is a palindrome");
        }else
        {
            System.out.println(s + " is not a palindrome");
        }

    }

    public static String reverse(String s)
    {
        int length = s.length();
        String rev = "";

        for(int i = length -1; i >= 0; i--)
        {
            rev = rev + s.charAt(i);
        }

        //return new String[] {s, rev};
        return rev;
    }

    public static boolean isPalindrome(String s)
    {
        return s.equals(reverse(s));
    }
}

