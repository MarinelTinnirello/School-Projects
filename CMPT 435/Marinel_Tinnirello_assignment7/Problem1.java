public class Problem1
{
    public static void main(String[] args)
    {
        double[] testarray = {1.3, 2.1, 2.1, 2.1, 2.1, 6.7, 7.5, 7.5, 8.6, 9.0};
        double t1 = 2.1;
        double t2 = 7.5;
        double t3 = 1.3;
        System.out.println(t1+" appears "+ count(testarray, t1) + " times");
        System.out.println(t2+" appears "+ count(testarray, t2) + " times");
        System.out.println(t3+" appears "+ count(testarray, t3) + " times");
    }

    public static int count(double[] A, double x)
    {
        /**** How to do this with a Linear Search
         * O(n) = n
         * how I originally was doing this
         ****/
        /*int count = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (x == A[i])
            {
                count++;
            }
        }*/

        int n = A.length;                       // used as temp
        int count = 0;                          // counts
        double start = 1;                       // beginning # to look for
        double end = A[n - 1];                  // ending # to look for
        double mid = (start + end) / 2;         // how to split

        for (int i = 0; start <= end; i++)
        {
            /* if x is the current index, add to count */
            if (x == A[i])
            {
                count++;
            }

            /* if x is less than the current index, change start to mid + 1
            * else if x is greater than the current index, change end to mid - 1
            */
            if (x < A[i])                       // the other way around (A[i] < x) didn't want to budge
            {
                start = mid + 1;
            } else
            {
                end = mid - 1;
            }

            if (x == -1)
            {
                return -1;
            }
        }

        return count;
    }
}