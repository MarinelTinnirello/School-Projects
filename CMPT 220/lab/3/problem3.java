/*********************
 Author: Marinel Tinnirello
 Lab 3 - Problem 3
 ********************/

public class Main
{
    public static void main (String[]args)
    {
        int n = 0;

        for (int i = 1; i <= 100; i++)
        {
            if (i % 10 == 0)
            {
                System.out.println();
            }
            n++;
            System.out.print(i + " " + (char) i + "  ");
        }
    }
}

