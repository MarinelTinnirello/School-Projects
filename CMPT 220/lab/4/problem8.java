/*********************
 Author: Marinel Tinnirello
 Lab 4 - Problem 8
 ********************/

import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList pos = new ArrayList(100);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (put 0 to end):      ");
        int i1 = input.nextInt();

        while (i1 != 0)
        {
            pos.add(i1);
            i1 = input.nextInt();
        }

        Collections.sort(pos);
        System.out.print(pos);
    }
}





