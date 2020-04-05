import java.util.ArrayList;
import java.util.List;

public class Problem1
{
    public static void main(String[] args)
    {
        int sum = 9;
        int testarray[] = {4, 12, 5, 2};

        System.out.println("There exists a subset of the input array with sum = "+ sum + ": " +
                subsetsum(testarray, sum, new ArrayList<List<Integer>>(), 0));
    }

    /**** Gets the sum into the List set ****/
    public static int getSum(List<Integer> set)
    {
        int sum = 0;

        for(Integer i : set)
        {
            sum += i;
        }

        return sum;
    }

    /**** Finds the sum of a subset of a given array ****/
    public static boolean subsetsum(int A[], int x, List<List<Integer>> sets, int index)
    {
        /***base cases
         * if index is the length of the array, return false
         * if the index of the array is x, return true
         * else if, continue
         ***/
        if (index == A.length) 
	{
            return false;
        }
        else if (A[index] == x) 
	{
            return true;
        } else 
	{
            List<List<Integer>> newSets = new ArrayList<List<Integer>>();

            /*** Adds existing sets to new list of sets ***/
            for (List<Integer> set : sets)
            {
                List<Integer> s = new ArrayList<Integer>();

                /*** adds i to the set ***/
                for (Integer i : set)
                {
                    s.add(i);
                }

                newSets.add(s);
            }

            /*** for each existing set, add new elements to it and create new sets ***/
            for (List<Integer> set : sets)
            {
                set.add(A[index]);

                /** if passing set into getSum is x, return true **/
                if (getSum(set) == x)
                {
                    return true;
                }
            }

            /* add the new element itself as the singleton set */
            List<Integer> s = new ArrayList<Integer>();

            s.add(A[index]);
            sets.add(s);

            /*** add new sets to make final set of sets ***/
            for (List<Integer> set : sets)
            {
                newSets.add(set);
            }

            return subsetsum(A, x, newSets, index + 1);
        }
    }
}