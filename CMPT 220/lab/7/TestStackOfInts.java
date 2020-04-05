
/*********************
 Author: Marinel Tinnirello
 Lab 7 - Problem 2
 ********************/

import java.util.Scanner;

public class TestStackOfInts
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive #:     ");
        int num = input.nextInt();

        System.out.print("The smallest factors of " + num + " are: ");
        StackOfIntegers stack = new StackOfIntegers();

        int factor = 2;

        while (factor <= num)
        {
            if (num % factor == 0)
            {
                stack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty())
        {
            System.out.print(stack.pop() + " ");
        }
    }
}
