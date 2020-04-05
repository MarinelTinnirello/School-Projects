/*********************
 Author: Marinel Tinnirello
 Lab 4 - Problem 2
 ********************/

public class Main
{
    public static void main (String[] args) {
       int [][] s = new int[5][5];

        for (int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                s[i][j] = (int)(Math.random() * 26 + 97);
                System.out.print((char)s[i][j] + " ");
            }

            System.out.println();
        }
    }
}


