/*********************
 Author: Marinel Tinnirello
 Lab 7 - Problem 11.11
 ********************/

import java.util.*;

public class SortArrayList
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 #s:     ");

        for(int i = 0; i < 5; i++)
        {
            list.add(input.nextInt());
        }

        Collections.sort(list);

        System.out.println("List after sorting:     ");
        for(int i = 0; i < 5; i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
