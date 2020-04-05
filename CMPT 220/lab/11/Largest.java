import java.util.*;

public class Largest
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] list = new int[8];

        System.out.println("Enter 8 integers:   ");

        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }

        System.out.println("Largest element:    " + max(list));
    }

    public static int max(int[] list)
    {
        int max = list[list.length - 1];
        int i = list.length - 1;

        return max(list, i, max);
    }

    public static int max(int[] list, int i, int max)
    {
        if(i < 0)
        {
            return max;
        }else if(list[i] > max)
        {
            return max(list, i - 1, list[i]);
        }else
        {
            return max(list, i - 1, max);
        }
    }
}
