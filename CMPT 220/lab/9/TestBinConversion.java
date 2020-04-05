/*********************
 Author: Marinel Tinnirello
 Lab 9 - Problem 3
 ********************/

import java.lang.Math;

public class TestBinConversion
{
    public static void main (String[] args)
    {
        System.out.println(bin2dec("1001"));
    }

    public static int bin2dec(String binaryString) throws NumberFormatException
    {
        int dec = 0;

        for(int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--)
        {
            if(binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
            {
                throw new NumberFormatException("STRING IS NOT BINARY STRING");
            }

            dec += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
        }

        return dec;
    }
}
