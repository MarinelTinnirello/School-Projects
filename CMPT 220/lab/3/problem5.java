/*********************
 Author: Marinel Tinnirello
 Lab 3 - Problem 5
 ********************/

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:           ");
        double a = input.nextDouble();
        System.out.println("Enter another number:     ");
        double b = input.nextDouble();
        System.out.println("Enter another number:     ");
        double c = input.nextDouble();

        System.out.println("Average:    " + average(a, b, c));
    }

    public static double average (double a, double b, double c)
    {
        double avg = 0;

        avg = (a + b + c) / 3;

        return avg;
    }
}

}
