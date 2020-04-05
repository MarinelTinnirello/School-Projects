public class Problem1
{
    public static void main(String[] args)
    {
        int[] A = {4,3,9,2,7,6,5};
        int n = A.length;

        System.out.println("Before partition:");
        for(int i = 0; i < A.length; i++)
        {
            System.out.print(A[i] + " ");
        }

        partition(A, 0, n - 1);

        System.out.println("\nAfter partition:");
        for (int i = 0; i < A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
    }

    /*** Partitions the array
     * A is some array passed by the main method
     * low is the lower index of the array
     * high is the higher index of the array
     ***/
    public static void partition(int[] A, int low, int high)
    {
        // Consider this algorithm as a pivot point one, so a quick sort should be okay

        int x = A[low];         // x is the 1st element of the array (the pivot), so the 1st element should start at low
        int i = low;            // i is the index of the smaller element
        int j = high;           // j is the index of the higher element

        /** Check to see if there's less than 2 elements in the array **/
        if (low >= high)
        {
            return;
        }

        /** Does the comparison **/
        while (i < j)
        {
            /** Compare the numbers **/
            /* If index lower is less than x, add to i */
            while (A[i] < x)
            {
                i++;
            }
            /* If index j higher is greater than x, decrement from j */
            while (A[j] > x)
            {
                j--;
            }

            /** Does the swaps **/
            if (i <= j)
            {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }
}
