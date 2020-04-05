/*********************
 Author: Marinel Tinnirello
 Lab 5 - Problem 3
 ********************/

import java.util.Arrays;
import java.util.Scanner;

public class main
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students:   ");

        int num = input.nextInt();
        int[] arr = new int[num];
        String[] names = new String[num];

        System.out.println("Enter student's names:   ");

        for (int i = 0; i < num; i++)
        {
            names[i] = input.next();

        }
        System.out.println("Enter student's scores:  ");
        for (int i = 0; i < num; i++)
        {

            arr[i] = input.nextInt();

        }

        sort(names, arr);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(arr));
    }

    public static void sort (String[] names, int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            String temp;
            int max = arr[i];
            int maxIndex = i;

            for(int j = i; j < arr.length; j++)
            {
                if (max > arr[j]) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i)
            {
                temp = names[maxIndex];
                names[maxIndex] = names[i];
                names[i] = temp;
                arr[maxIndex] = arr[i];
                arr[i] = max;
            }
        }
    }
}
