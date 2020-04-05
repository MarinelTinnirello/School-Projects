/*********************
 Author: Marinel Tinnirello
 Lab 9 - Problem 1
 ********************/


import java.lang.Math;
import java.util.Scanner;

public class TestExceptions
{
    public static void main (String[] args)
    {
        int arr[] = new int[100];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.print("Enter index:      ");

        try
        {
            int index = input.nextInt();
            System.out.println("array[" + index + "] = " + arr[index]);
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println("INDEX " + e.getLocalizedMessage() + " IS OUT OF BOUNDS");
        }catch (Exception e)
        {
            System.out.println("INVALID INPUT");
        }
    }
}
