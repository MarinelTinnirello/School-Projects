public class Problem1
{
    public static void main(String[] args)
    {
        char[] givenarray = {'o', 't', 'z', 'y', 'e', 's', 'v', 'g', 'r', 'a', 'y', 'e', 's'};

        System.out.println("The rightmost occurence of 'yes' in the given array is at index "+ where(givenarray,
                "yes", givenarray.length - 1));
    }

    public static int where(char[] A, String s, int i)
    {
        int result = -1;

        /** base case
         * if size is less than 3, word can't exist
         * else if, continue
         **/
        if (A.length < 3)
        {
            return -1;
        } else
        {
            /** if i is > 1, continue **/
            if (i > 1)
            {
                /** if i - 2 is 'y',
                 * if i - 1 is 'e'
                 * if i is 's", then result = i - 2 to reach the index of 'y'
                 * else if, result = call where with i - 1
                 **/
                if (A[i - 2] == 'y')
                {
                    if (A[i - 1] == 'e')
                    {
                        if (A[i] == 's')
                        {
                            result = i - 2;
                        }
                    }
                } else
                {
                    result = where(A, "yes", i - 1);
                }
            }
        }

        return result;
    }
}