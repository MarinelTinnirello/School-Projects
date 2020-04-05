/*********************
 Author: Marinel Tinnirello
 Lab 3 - Problem 4
 ********************/

public class Main
{
    public static void main(String[] args)
    {
        int max = 15000;
        boolean isPrime = false;

        while (isPrime == false)
        {
            for(int i = max/2; i > 1; i--)
            {
                if(max % i == 0)
                {
                    break;
                }
                if(i == 2 && (max/2) != 0)
                {
                    isPrime = true;
                    System.out.println("Largest prime <15,000:   " + max);
                    break;
                }
            }
            max--;
        }
    }
}
