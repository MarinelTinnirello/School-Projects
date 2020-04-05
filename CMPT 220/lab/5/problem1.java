/*********************
 Author: Marinel Tinnirello
 Lab 5 - Problem 1
 ********************/

import java.util.Scanner;

public class main
{
    static final int MAX_SIZE = 10;

    public static void main (String[] args)
    {
        double[] n = new double[MAX_SIZE];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + MAX_SIZE + " numbers: ");

        for (int i = 0; i < n.length; i++)
        {
            n[i] = input.nextDouble();
        }

        System.out.println("Max #: " + max(n));
    }

    public static double max (double[] arr)
    {
        double max = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i]) max = arr[i];
        }

        return max;
    }
}
