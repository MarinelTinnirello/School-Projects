public class Problem2
{
    public static void main(String[] args)
    {
        double[] testarray1 = {2, 3, 10, 6, 4, 8, 1};
        // maxdiff: 8

        double[] testarray2 = {7, 9, 1, 6, 3, 2};
        // maxdiff: 5

        System.out.println("Maximum Difference:     " + findmaxdiff(testarray1));
        System.out.println("Maximum Difference:     " + findmaxdiff(testarray2));
    }

    public static double findmaxdiff(double[] A)
    {
        double max = 0;
        double min = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (i < min)
            {
                min = i;
            } else if (i > max)
            {
                max = i;
            }
        }

        return max - min;
    }
}
