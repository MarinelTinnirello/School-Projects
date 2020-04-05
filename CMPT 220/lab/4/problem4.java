/*********************
 Author: Marinel Tinnirello
 Lab 4 - Problem 4
 ********************/

import java.util.Scanner;

public class Main
{
    static final int maxChar = 256;

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s;

        System.out.print("Enter a string:  ");
        s = input.nextLine();

        counter(s);
    }

    public static void counter (String s)
    {
        int count[] = new int[maxChar];
        int length = s.length();
        char ch[] = new char[s.length()];

        for(int i = 0; i < length; i++)
        {
            count[s.charAt(i)]++;
        }

        for(int i = 0; i < length; i++)
        {
            ch[i] = s.charAt(i);
            int find = 0;

            for(int j = 0; j <= i; j++)
            {
                if(s.charAt(i) == ch[j] && !Character.isSpaceChar(ch[i]))
                {
                    find++;
                }
            }

            if(find == 1)
            {
                System.out.println(s.charAt(i) + " occurs: " + count[s.charAt(i)]);
            }
        }
    }
}
