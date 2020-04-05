/*********************
 Author: Marinel Tinnirello
 Lab 4 - Problem 1
 ********************/

public class Main
{
    public static void main(String[] args)
    {
        int cm = 1;

        System.out.println("in      cm   |  cm      in");
        System.out.println("---------------------------");

        for(int i = 1; i <= 50; i++)
        {
            System.out.print("" + i + "      ");
            System.out.printf("%.2f", (i * 2.54));
            System.out.print("  |  " + cm + "     ");
            System.out.printf("%.2f", (cm / 2.54));
            System.out.println();
            cm += 5;
        }
    }
}



