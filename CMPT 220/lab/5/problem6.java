/*********************
 Author: Marinel Tinnirello
 Lab 5 - Problem 6
 ********************/

import java.util.Scanner;

public class main
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total rows and columns:   ");

        int row = input.nextInt();
        int col = input.nextInt();
        double arr[][] = new double[row][col];

        System.out.println("Enter matrix:   ");

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                arr[i][j] = input.nextInt();
                System.out.print(" ");
            }
        }

        System.out.println("Matrix:   ");

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.print(" ");
        }
	
	System.out.println("\n");
        System.out.println("Enter # of columns to avg:    ");

        Scanner input2 = new Scanner(System.in);
        int colNum = input2.nextInt();
        double avg = average(arr, colNum);

        System.out.println("Avg:    " + avg);

    }

    public static double average (double[][] arr, int colNum)
    {
        double colSum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            colSum += arr[i][colNum - 1];
        }

        double avg = (double)colSum / arr.length;

        return avg;
    }
}

}

