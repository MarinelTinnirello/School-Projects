/*********************
 Author: Marinel Tinnirello
 Lab 9 - Problem 2
 ********************/

import java.util.Scanner;

public class TestTriangle
{
    public static void main (String[] args)
    {
        String color;
        boolean fill;
        Scanner input = new Scanner(System.in);
        double sideList[] = handler(input);
        Triangle tri = new Triangle(sideList[0], sideList[1], sideList[2]);

        System.out.println("Enter color:    ");
        color = input.next();

        System.out.println("Fill triangle:  ");
        fill = input.nextBoolean();

        tri.setColor(color);
        tri.setFill(fill);

        System.out.println("Sides of:   " + tri.toString());
        System.out.println("Area:       " + tri.getArea());
        System.out.println("Perimeter:  " + tri.getPerimeter());
        System.out.println("Is filled:  " + tri.isFilled());
    }

    public static double[] handler(Scanner input)
    {
        double arr[] = new double[3];

        for(int i = 0; i == 0; i++)
        {
            try
            {
                System.out.println("Enter sides:    ");
                arr[0] = input.nextInt();
                arr[1] = input.nextInt();
                arr[2] = input.nextInt();
            }catch (Exception e)
            {
                System.out.println("Exception " + e);
            }
        }

        return arr;
    }
}