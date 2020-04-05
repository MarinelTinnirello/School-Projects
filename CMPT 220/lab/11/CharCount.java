import java.util.Scanner;

public class CharCount
{
    static int k = 0;

    public static void main (String[] args)
    {
        try
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter string:   ");
            String str = input.nextLine();

            System.out.println("Enter character to check:   ");
            String temp = input.nextLine();
            char c = temp.charAt(0);

            int count = count(str, c);

            System.out.println("There are " + count + " " + c + "'s");

        }catch (Exception e)
        {
            System.out.println("ERROR.  ");
        }
    }

    public static int count (String str, char c)
    {
        return count(str, c, 0);
    }

    public static int count (String str, char c, int high)
    {
        if(str.equals(""))
        {
            return 0;
        }

        if (high + 1 <= str.length())
        {
            if (str.substring(high, high + 1).equals(Character.toString(c)))
            {
                k++;
            }

            count(str.substring(high + 1, str.length()), c, high);
        }

        return k;
    }
}
