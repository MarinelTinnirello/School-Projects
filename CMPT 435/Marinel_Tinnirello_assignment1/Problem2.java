public class Problem2
{
    public static void main(String[] args)
    {
        int[] testarray1 = {2, 4, 1, 6, 3, 7, 8};
        int[] testarray2 = {6, 3, 4, 5, 1};
        int n1 = testarray1.length;
        int n2 = testarray2.length;

        System.out.println("The missing number in testarray1 "+ missingnumber(testarray1, n1));
        System.out.println("The missing number in testarray2 "+ missingnumber(testarray2, n2));
    }

    /*** Finds missing number ***/
    public static int missingnumber(int[] A, int num)
    {
        //Basically did something similar in class

        int total = ((num + 1) * (num + 2) / 2);      // total of the array

        /** Goes through the array to search for missing number **/
        for (int i = 0; i < num; i++)
        {
            total -= A[i];
        }

        return total;
    }
}
