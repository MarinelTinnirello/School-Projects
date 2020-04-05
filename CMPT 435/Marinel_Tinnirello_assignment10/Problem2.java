import java.util.HashSet;

public class Problem2
{
    public static void main(String[] args)
    {
        double[] testarray1 = {0, 0, 0, 1, 2, 3, 97, 98};
        double[] testarray2 = {0, 1, 2, 3, 4, 4, 10, 98, 100, 100};


        System.out.println("Elements that occur in both arrays: ");
        commonelements(testarray1,testarray2);
        //should output 0, 1, 2, 3, 98
    }

    public static void commonelements(double[] s1, double[] s2)
    {
        // how to do this without hash tables
        // but I'd need to create something to get rid of duplicates
        // otherwise I will up the ante of my O(n) :(
        /*int i = 0;
        int j = 0;

        while ((i < s1.length) && (j < s2.length))
        {
            if (s1[i] == s2[j])
            {
                System.out.print(s1[i++] + " ");
            } else if (s2[j] < s1[i])
            {
                System.out.print(s2[j++] + " ");
            } else
            {
                System.out.print(s2[j++] + " ");
                i++;
            }
        }*/

        // how to write using a hash table
        // unlike the previous, it won't need a separate thing to remove duplicates
        HashSet<Double> s = new HashSet<>();

        /*** stores elements of 2nd array into hash table ***/
        for (int i = 0; i < s2.length; i++)
        {
            s.add(s2[i]);
        }

        /*** prints all the elements that appear in both ***/
        for (int i = 0; i < s1.length; i++)
        {
            /** if the set contains the index, print it out **/
            if (s.contains(s1[i]))
            {
                System.out.print(s1[i] + " ");
            }
        }
    }
}