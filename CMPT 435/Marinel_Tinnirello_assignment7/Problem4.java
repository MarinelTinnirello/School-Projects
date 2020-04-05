public class Problem4
{
    public static void main(String[] args)
    {
        int x1 = 8;
        int x2 = 5;
        int x3 = 17;
        System.out.println("The square root of " + x1 + " is " + squareroot(x1));
        System.out.println("The square root of " + x2 + " is " + squareroot(x2));
        System.out.println("The square root of " + x3 + " is " + squareroot(x3));
    }

    public static int squareroot(int x)
    {
        // done using binary search (a.k.a. The splits)

        int start = 1;                      // beginning # to look for
        int end = x;                        // ending # to look for
        int mid;                            // how to split
        int ans = 0;                        // what's being returned

        /** if x equals either 0 or 1, a sqrt can't be found **/
        if (x == 0 || x == 1)
        {
            return x;
        }

        /** performs binary search on x
         * so long as start is less than end, continue the loop
         **/
        while (start <= end)
        {
            mid = (start + end) / 2;                        // likes being defined here instead of up there

            /* if x is a perfect square, return mid */
            if (x == (mid * mid))
            {
                return mid;
            }

            /* if mid^2 is less than x, change the start to mid + 1 and change ans = mid
             * if else mid^2 is greater than x, change end to mid - 1
             */
            if ((mid * mid) < x)
            {
                start = mid + 1;
                ans = mid;
            } else
            {
                end = mid - 1;
            }
        }

        return ans;
    }
}