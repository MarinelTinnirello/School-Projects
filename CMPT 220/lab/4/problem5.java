/*********************
 Author: Marinel Tinnirello
 Lab 4 - Problem 5
 ********************/

import java.lang.Math;

public class Main
{
    public static void main (String[] args)
    {
        double num[] = new double[1000];
        int greaterThan = 0;
        int lessThan = 0;
        int sum = 0;
        double avg;

        for(int i = 0; i < num.length; i++)
        {
            num[i] = (double)Math.random() * 100;
            sum += num[i];
        }

        avg = (double)sum / num.length;

        for(int i  = 0; i < num.length; i++)
        {
            if(num[i] > avg)
            {
                greaterThan++;
            }else
            {
                lessThan++;
            }
        }

        System.out.println("Average:     " + avg);
        System.out.println("#s > Avg:    " + greaterThan);
        System.out.println("#s < Avg:    " + lessThan);
    }
}
