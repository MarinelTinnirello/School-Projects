import java.util.*;

public class Addition
{
    static int sum;

    public static void main (String[] args)
    {
        try
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter integer:  ");
            long n = input.nextLong();

            System.out.println("Sum:            " + sumDigits(n));
        }catch(Exception e)
        {
            System.out.println("ERROR.  Input not an integer.");
        }
    }

    public static int sumDigits(long n)
    {
        if(n > 0)
        {
            sum = sum + (int)n % 10;
            sumDigits(n / 10);
        }

        return sum;
    }
}
