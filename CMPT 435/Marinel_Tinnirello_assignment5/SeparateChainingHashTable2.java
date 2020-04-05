import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SeparateChainingHashTable2<AnyType>
{

    private static final int DEFAULT_TABLE_SIZE = 101;

    /** HashTable: an array of linked lists. */
    private LinkedList [ ] HashTableSC;
    private int currentSize;

    /**
     * Construct the hash table.
     */
    public SeparateChainingHashTable2( )
    {
        this( DEFAULT_TABLE_SIZE );
    }

    /**
     * Construct the hash table.
     * @param size approximate table size.
     */
    public SeparateChainingHashTable2( int size )
    {
        HashTableSC = new LinkedList[ size ];
        for( int i = 0; i < HashTableSC.length; i++ )
            HashTableSC[ i ] = new LinkedList<>( );
    }

    /**
     * Insert into the hash table. If the item is
     * already present, then update the item.
     * @param x the item to insert.
     */
    public void insert( Object gkey, Object gvalue )
    {
        int map_value = myhash( gkey );
        List<Item> whichList = HashTableSC[ map_value ];


        int getindex = keyexist(whichList, gkey);
        Item newitem = new Item(gkey,gvalue);

        if( getindex == -1 )
        {

            whichList.add(newitem);
        }
        else
        {
            //System.out.println("new value "+ gvalue);
            //System.out.println("current value in the list "+ whichList.get(getindex).value);
            //If the item exists, overwrite it.
            whichList.set(getindex, newitem);
        }

    }

    /**
     * Remove from the hash table.
     * @param x the item to remove.
     */
    public void remove( Object gkey )
    {
        int map_value = myhash( gkey );
        List<Item> whichList = HashTableSC[ map_value ];
        int getindex = keyexist(whichList, gkey);
        if( getindex != -1 )
        {
            whichList.remove(getindex);
            currentSize--;
        }
    }

    public int keyexist(List<Item> glist, Object gkey)
    {
        Iterator<Item> iterator = glist.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Item current = iterator.next();
            if (current.key.equals(gkey)) {
                //System.out.println("size of list "+glist.size());
                //System.out.println("index " + index);
                return index;
            }
            index++;
        }
        return -1;

    }

    public Item get( Object gkey )
    {
        List<Item> whichList = HashTableSC[ myhash( gkey ) ];
        int getindex = keyexist(whichList, gkey);
        if( getindex != -1 )
        {
            return whichList.get(getindex);
        }

        return null;
    }

    /**
     * Find an item in the hash table.
     * @param string the item to search for.
     * @return true if x isnot found.
     */
    public boolean contains( Object gkey )
    {
        List<Item> whichList = HashTableSC[ myhash( gkey ) ];
        Iterator<Item> iterator = whichList.iterator();
        while (iterator.hasNext()) {
            Item current = iterator.next();
            if (current.key.equals(gkey)) {
                //System.out.println("size of list "+glist.size());
                //System.out.println("index " + index);
                return true;
            }

        }
        return false;
    }

    public boolean containsValue( Object gvalue )
    {
        for(int i = 0; i < HashTableSC.length; i++)
        {
            List<Item> whichList = HashTableSC[ i ];
            Iterator<Item> iterator = whichList.iterator();
            while (iterator.hasNext()) {
                Item current = iterator.next();
                if (current.value.equals(gvalue)) {

                    return true;
                }

            }
        }
        return false;
    }

    /**
     * Make the hash table logically empty.
     */
    public void makeEmpty( )
    {
        for( int i = 0; i < HashTableSC.length; i++ )
            HashTableSC[ i ].clear( );
        currentSize = 0;
    }

    private int myhash( Object x )
    {
        int hashVal = x.hashCode( );

        hashVal %= HashTableSC.length;
        if( hashVal < 0 )
            hashVal += HashTableSC.length;

        return hashVal;
    }



    public static boolean subset(int[] set1, int[] set2, int n1, int n2)
    {
        // Complete the method to find out if set1[] is a subset of set2[]

        HashSet<Integer> hs = new HashSet<>();

        /** loop through array to store all elements of arr1 into hs **/
        for (int i = 0; i < n1; i++)
        {
            if (!hs.contains(set1[i]))
            {
                hs.add(set1[i]);
            }
        }
    /** loop through array to check if any elements of arr2 are in arr1 **/
        for (int i = 0; i < n2; i++)
        {
            if (!hs.contains(set2[i]))
            {
                System.out.println("B[] is not a subset of A[]");

                return false;
            }
        }

        System.out.println("B[] is a subset of A[]");

        return true;
    }

    // Simple main
    public static void main( String [ ] args ) throws FileNotFoundException
    {
        int A[] = {11, 1, 13, 21, 3, 7};
        int B[] = {11, 3, 7, 5};
        int n1 = A.length;
        int n2 = B.length;

        // Complete the method to find out if B[] is a subset of A[]
        // Full credit (30 points) will be awarded for an algorithm that uses SeparateChainingHashTable2 and O(n). Algorithms not using hashtable or slower will be scored out of 10 points.

        System.out.println(subset(A, B, n1, n2));
    }

}