public class Problem2
{
    public static void main(String[] args)
    {
        int[] givenarray = {100,2,3,4,5,6,7,67,2,32};
        Max2ndMax pair = new Max2ndMax();

        int start = 0;
        int end = givenarray.length - 1;

        pair = dcfindmax2ndmax(givenarray, 0, givenarray.length-1);

        int max2nd = pair.max2nd;
        int max = pair.max;

        System.out.println("The max and 2ndmax of the given array are "+ max + " and "+max2nd+".");
        // Your method should return 100 and 67
    }

    public static Max2ndMax dcfindmax2ndmax(int[] A, int i, int j)
    {
        // At most 3/2n-2 comparisons
        Max2ndMax result = new Max2ndMax();
        Max2ndMax left = new Max2ndMax();
        Max2ndMax right = new Max2ndMax();

        /** if A is of size 1, set the result equal to that index and return result
         * else if A is of size 2, check which is larger and return result
         * else if A is of another size,
            * split into L[] and R[]
         * **/
        if (i == j)
        {
            result.max = A[i];
            result.max2nd = A[j];

            return result;
        } else if (i == j + 1)
        {
            /* if A at index i is larger than j, set max to i and max2nd to j
            * else if A at index i is smaller than j, set max to j and max2nd to i
            */
            if (A[i] > A[j])
            {
                result.max = A[i];
                result.max2nd = A[j];
            } else
            {
                result.max = A[j];
                result.max2nd = A[i];
            }

            return result;
        } else
        {
            int mid = (i + j) / 2;

            left = dcfindmax2ndmax(A, i, mid);
            right = dcfindmax2ndmax(A, mid +  1, j);
            result = max1max2(left, right);
        }

        return result;
    }

    public static int max(int a, int b)
    {
        if (a < b)
        {
            return a;
        }

        return b;
    }

    public static Max2ndMax max1max2 (Max2ndMax a, Max2ndMax b)
    {
        Max2ndMax result = new Max2ndMax();

        /** if A is greater
         * else if B is greater
         **/
        if (a.max > b.max) {
            result.max = a.max;

            if (a.max2nd > b.max)
            {
                result.max = a.max2nd;
            } else
            {
                result.max2nd = b.max;
            }
        } else
        {
            result.max = b.max;

            if (b.max2nd > a.max)
            {
                result.max2nd = b.max2nd;
            }
            else
            {
                result.max2nd = a.max;
            }
        }

        return result;
    }
}