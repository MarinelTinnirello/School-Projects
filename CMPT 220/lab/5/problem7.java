/*********************
 Author: Marinel Tinnirello
 Lab 5 - Problem 7
 ********************/

import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class main
{
    private final static int N = 4;

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] mat = new int [100][100];

        System.out.println("Enter a matrix:     ");
        input.nextInt();
        input.nextInt();

        if (isUpperTriMat(mat))
        {
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }
    }

    public static Boolean isUpperTriMat (int mat[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < i; j++)
            {
                return false;
            }
        }

        return true;
    }
}
