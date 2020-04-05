import java.util.Scanner;

public class CharCountInArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list of characters:   ");
        String str1 = input.nextLine();
        char[] list = str1.toCharArray();

        System.out.println("Enter character to check:   ");
        String str2 = input.nextLine();
        char ch = str2.charAt(0);

        int count = count(list, ch);
        /*for (int i = 0; i < list.length; i++)
        {
            list[i] = str.charAt(i);
        }

        char ch = str.charAt(str.length() - 1);*/

        System.out.println("There are " + count);
    }

    public static int count (char[] list, char ch)
    {
        return count(list, ch, list.length - 1);
    }

    public static int count (char[] list, char ch, int high)
    {
        if(high >= 0)
        {
            int count = 0;
            char c = list[high];

            if (Character.toUpperCase(c) == Character.toUpperCase(ch))
            {
                count++;
            }

            return count + count(list, ch, high - 1);
        }else
        {
            return 0;
        }
    }
}
