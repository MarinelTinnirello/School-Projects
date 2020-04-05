/*********************
 Author: Marinel Tinnirello
 Lab 5 - Problem 4
 ********************/

import java.util.Arrays;
import java.util.Scanner;

public class main
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a size:   ");
        int size = input.nextInt();

        System.out.println("Enter " + size + " numbers for array:   ");

        int[] arr1 = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr1[i] = input.nextInt();
        }

        System.out.println("Enter " + size + " numbers for array:   ");

        int[] arr2 = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr2[i] = input.nextInt();
        }

        System.out.println("Arrays are " + equal(arr1, arr2));
    }

    public static boolean equal (int[] x, int[] y)
    {
        Arrays.sort(x);
        Arrays.sort(y);

        for (int i = 0; i < x.length; i++)
        {
            if (i == (x.length - 1) && x[i] == y[i])
            {
                return true;
            }
        }

        return false;
    }
}

