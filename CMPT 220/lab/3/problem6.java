/*********************
 Author: Marinel Tinnirello
 Lab 3 - Problem 6
 ********************/

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        vowels();
    }

    public static void vowels ()
    {
        Scanner input = new Scanner(System.in);
        String words;
        int vowelCount = 0;

        System.out.println("Enter a word or phrase:   ");
        words = input.nextLine();
        char[] c = words.toLowerCase().toCharArray();
        //c = c.replaceAll(" ", "'");

        for(int i = 0; i < words.length(); i++)
        {
            if((c[i] == 'a') || (c[i] == 'e') || (c[i] == 'i') || (c[i] == 'o') || (c[i] == 'u'))
            {
                vowelCount++;
            }
        }

        System.out.println("Vowels:     " + vowelCount);
    }
}
