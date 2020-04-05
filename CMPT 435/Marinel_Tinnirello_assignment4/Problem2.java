import java.util.HashSet;

public class Problem2
{
    public static void main(String[] args)
    {
        int[] testarray1 = {11, 1, 13, 21, 3, 7};
        int[] testarray2 = {11, 3, 7, 1};
        int[] testarray3 = {1, 2, 3, 4, 5, 6};
        int[] testarray4 = {1, 2, 4};
        int[] testarray5 = {10, 5, 2, 23, 19};
        int[] testarray6 = {19, 5, 3};
        int n1 = testarray1.length;
        int n2 = testarray2.length;
        int n3 = testarray3.length;
        int n4 = testarray4.length;
        int n5 = testarray5.length;
        int n6 = testarray6.length;

        System.out.println(subset(testarray1, testarray2, n1, n2));
        System.out.println(subset(testarray3, testarray4, n3, n4));
        System.out.println(subset(testarray5, testarray6, n5, n6));
    }

    public static boolean subset(int arr1[], int arr2[], int n1, int n2)
    {
        /* Methods that'll give us an O(n) time are:
        * Looping to grab arr2's elements, then looping (inwards) to grab elements from outer
        * Hash table to run through arr2
        * Haven't played that much with hash tables, so I'll try that here
        */
        
        /* Differences between HashMap and HashSet:
        * HashMap - allows duplicates
        * HashSet - doesn't allow duplicates 
        */
        HashSet<Integer> hs = new HashSet<>();

        /** loop through array to store all elements of arr1 into hs **/
        for (int i = 0; i < n1; i++)
        {
            if (!hs.contains(arr1[i]))
            {
                hs.add(arr1[i]);
            }
        }
        /** loop through array to check if any elements of arr2 are in arr1 **/
        for (int i = 0; i < n2; i++)
        {
            if (!hs.contains(arr2[i]))
            {
                System.out.println("B[] is not a subset of A[]");
                return false;
            }
        }

        System.out.println("B[] is a subset of A[]");
        
        return true;
    }
}
