/*********************
 Author: Marinel Tinnirello
 Lab 5 - Problem 5
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

        System.out.println("Before Transpose:   ");

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println(" ");
        }

        System.out.println("After Transpose:    ");

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(arr[j][i] + " ");
            }

            System.out.println(" ");
        }
    }
}

