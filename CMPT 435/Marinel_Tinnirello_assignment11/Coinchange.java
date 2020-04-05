import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Coinchange
{
    public static void main(String[] args)
    {
        int n = 0; // n cents

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the value you want to make change: ");

        n = reader.nextInt();

        int[] coins = {25, 10, 5, 1};


        System.out.println("used "+ greedycoinchange(n, coins)+" coins for "+ n + " cents");
    }

    public static int greedycoinchange(int givenvalue, int[] givencoins)
    {
        // Complete the code here to make change of givenvalue using coins in the array givencoins
        // Minimize the number of coins used
        // Input: Coin denominations in array givencoins are already sorted in descending order
        // Output: The number of coins used to make change of givenvalue
        int result = 0;

        /** base case: if the given value is 0, return 0 **/
        if (givenvalue == 0)
        {
            return 0;
        }

        /*** general case: for i is 0 and is less than the length, increment ***/
        for (int i = 0; i < givencoins.length; i++)
        {
            /*** while the given value subtracted by the given coin's index is greater than or equal to -, set the given
             * value equal to the given coin's index, increment the result ***/
            while ((givenvalue - givencoins[i]) >= 0)
            {
                givenvalue = givenvalue - givencoins[i];
                result++;
            }
        }

        return result;
    }
}