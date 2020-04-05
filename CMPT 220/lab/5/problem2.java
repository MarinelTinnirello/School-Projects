/*********************
 Author: Marinel Tinnirello
 Lab 5 - Problem 2
 ********************/

import java.util.Scanner;
import java.lang.Math;

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

        double meanNum = mean(n);
        double stdDevNum = deviation(n, meanNum);

        System.out.println("Std Dev:    " + stdDevNum);
        System.out.println("Mean:       " + meanNum);
    }

    public static double mean(double[] x)
    {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < x.length; i++)
        {
            sum += x[i];
            count++;
        }

        return (double)sum / (double)count;
    }

    public static double deviation(double[] x, double meanNum)
    {
        double stdDev = 0;

        for (double num : x)
        {
            stdDev += Math.pow(num - meanNum, 2);
        }

        return Math.sqrt(stdDev / (int)(x.length));
    }
}
