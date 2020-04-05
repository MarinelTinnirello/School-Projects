/*********************
 Author: Marinel Tinnirello
 Lab 9 - Problem 4
 ********************/

import java.util.*;
import java.io.*;

public class TestRemoveText
{
    public static void main(String[] args) throws Exception
    {
        if(args.length != 2)
        {
            System.out.println("Usage: java RemoveText <string to remove> <filename>");
            System.exit(1);
        }

        File file = new File(args[1]);
        if(!file.exists())
        {
            System.out.println("File " + args[1] + " doesn't exist");
            System.exit(2);
        }

        ArrayList<String> s2 = new ArrayList<>();
        try (Scanner input = new Scanner(file))
        {
            while (input.hasNext())
            {
                String s1 = input.nextLine();
                s2.add(removeString(args[0], s1));
            }
        }

        try (PrintWriter output = new PrintWriter(file))
        {
            for (int i = 0; i < s2.size(); i++)
            {
                output.println(s2.get(i));
            }
        }
    }

    public static String removeString(String string, String line)
    {
        StringBuilder stringBuilder = new StringBuilder(line);
        int start = stringBuilder.indexOf(string);
        int end = string.length();

        while (start >= 0) {
            end = start + end;
            stringBuilder = stringBuilder.delete(start, end);
            start = stringBuilder.indexOf(string, start);
        }

        return stringBuilder.toString();
    }
}
