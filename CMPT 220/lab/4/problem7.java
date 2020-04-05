/*********************
 Author: Marinel Tinnirello
 Lab 4 - Problem 7
 ********************/

import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        ArrayList pos = new ArrayList();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integers (put -1 to end):    ");
        int i1 = input.nextInt();

        while (i1 != -1)
        {
            pos.add(i1);
            i1 = input.nextInt();
        }

        for (int i = 0; i < pos.size(); i++)
        {
            for (int j = i + 1; j < pos.size(); j++)
            {
                if(pos.get(i) == pos.get(j))
                {
                    pos.remove(j);
                }
            }
        }

        System.out.print(pos);
    }
}




