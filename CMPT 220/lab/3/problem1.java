/*********************
 Author: Marinel Tinnirello
 Lab 3 - Problem 1
 ********************/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int counter = -1;
        int even = 0;
        int sum = 0;

        System.out.println("Enter a number (use 0 to end):      ");
        //i = input.nextInt();

        while(i != 0)
        {
            i = input.nextInt();

            if((i % 2 == 0) && i != 0)
            {
                even++;
                sum += i;
            }
            counter++;

        }

        System.out.println("Even numbers:   "+ even);
        System.out.println("Sum:        " + sum);
        System.out.println("Average:    " + sum/counter);
    }
}
