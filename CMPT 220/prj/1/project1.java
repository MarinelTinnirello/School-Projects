/*********************
 Author: Marinel Tinnirello
 Project 1
 ********************/

/*Program does work, however, Kattis gave me "Wrong answer" or "Compiler errors" anytime I submitted and I couldn't find what the
	problem was*/

import java.util.Scanner;

class project1
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isWall = false;
        int count = 0;
        int row = 1;

        System.out.println("Enter height, length, and width:    ");

        int height = input.nextInt();
        int length = input.nextInt();
        int bricks = input.nextInt();

        if (height < 0 || length < 0 || bricks < 0)		//catches values Kattis puts in if it's negative
        {
            System.out.println("THE VALUES ARE NEGATIVE");
        }else							//handles rest of the program
        {


            System.out.println("Enter " + bricks + " bricks:  ");

            int[] wall = new int[bricks];

            for (int i = 0; i < bricks; i++)			//goes through the bricks for the wall
            {
                wall[i] = input.nextInt();
            }

            for (int i = 0; i < bricks; i++)			//checks if the bricks work for the wall
            {
                count += wall[i];

                if (count == length)
                {
                    count = 0;
                    row += 1;

                    if (row > height)
                    {
                        isWall = true;
                    }
                }else if (count > length)
                {
                    break;
                }
            }

            if (isWall)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
}
