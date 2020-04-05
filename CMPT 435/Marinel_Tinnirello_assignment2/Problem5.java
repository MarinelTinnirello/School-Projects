public class Problem5
{
    public static void main(String[] args)
    {
        int[] testarray1 = {0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7};
        int[] testarray2 = {0, 0, 0, 1, 1, 2, 3, 10, 10};
        int n1 = testarray1.length;
        int n2 = testarray2.length;

        System.out.println("Does there exist a majoirty element in testarray1? "+ majority(testarray1, n1));
        System.out.println("Does there exist a majoirty element in testarray2? "+ majority(testarray2, n2));
    }

    public static boolean majority(int[] A, int n)
    {
		int count = 0;          // for counting the majority element
        int element = 0;        // the majority element

        /** Checks for if the majority element exists **/
        for (int i = 0; i < n; i++)
        {
            if (count == 0)
            {
                element = A[i];
            }
            if (A[i] == element)
            {
                count++;
            } else
            {
                count--;
            }
        }

        count = 0;              // reset to use below

        /** Does the majority **/
        for (int i = 0; i < n; i++)
        {
            if (A[i] == element)
            {
                count++;
            }
        }

        if (count > (n / 2))
        {
            System.out.println("Majority Element:   " + element);
            return true;
        } else
        {
            System.out.println("There is is no Majority Element");
            return false;
        }
    }
}
