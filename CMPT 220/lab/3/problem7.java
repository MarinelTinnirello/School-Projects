/*********************
 Author: Marinel Tinnirello
 Lab 3 - Problem 7
 ********************/

public class Main
{
    public static void main(String[] args)
    {
        final int NUMBERS_PER_LINE = 10;
        int n = 0;

        for(int i = 0; i <= 50; i++)
        {
            if(i % NUMBERS_PER_LINE == 0)
            {
                System.out.println();
            }
            System.out.print(pentagonalNumber(i) + " ");
            n++;
        }
    }

    public static int pentagonalNumber (int n)
    {
        int pent = ((3 * (n^2) - n)) / 2;

        return pent;
    }
}
