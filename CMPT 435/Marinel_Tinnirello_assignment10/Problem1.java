public class Problem1
{
    public static void main(String[] args)
    {
        double[] testarray1 = {1, 10, 45};
        double[] testarray2 = {-8, 4, 6};
        double target1 = 16;
        double target2 = 70;

        System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target1 + "?");
        System.out.println(checksum(testarray1,testarray2, target1));
        // should print true

        System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target2 + "?");
        System.out.println(checksum(testarray1,testarray2, target2));
        // should print false

    }

    public static boolean checksum(double[] s1, double[] s2, double x)
    {
        int i = 0;
        int j = s2.length - 1;

        /*** while i is less than j, continue to scan through the arrays ***/
        while (i < j)
        {
            /** Base Case:  if the indexes of the arrays = x, return true
             * General Cases:  else if the indexes of the arrays is less than x, increment i by 1
             *                  else if, decrement j by 1
             **/
            if ((s1[i] + s2[j]) == x)
            {
                return true;
            } else if ((s1[i] + s2[j]) < x)
            {
                i++;
            } else
            {
                j--;
            }
        }

        return false;
    }
}
