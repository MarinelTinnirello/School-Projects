public class LinkedList
{
    // The LinkedList Node class
    private class Node
    {
        int data;
        Node next;

        Node(int gdata)
        {
            this.data = gdata;
            this.next = null;
        }
    }

    // The LinkedList fields
    Node head;

    // Constructor
    LinkedList(int gdata)
    {
        this.head = new Node(gdata);
    }

    public static void main(String[] args)
    {

        LinkedList exlist = new LinkedList(0);

        exlist.Insertend(1);
        exlist.Insertend(5);
        exlist.Insertend(2);
        exlist.Insertend(7);
        exlist.Insertend(10);
        exlist.Insertend(3);

        exlist.Listprint();
        //output: 0 1 5 2 7 10 3
        exlist.Listsort(exlist.head);
        exlist.Listprint();
        //output should be: 0 1 2 3 5 7 10
    }

    public void Insertend(int gdata)
    {
        Node current = this.head;

        while(current.next!= null)
        {
            current = current.next;
        }

        Node newnode = new Node(gdata);
        current.next = newnode;
    }

    public void Listprint()
    {
        Node current = this.head;

        while(current!= null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    /**** Sorts the linked list
     * O(n): n log n
     ****/
    public void Listsort(Node start)
    {
        Node current = start, index = null;
        int temp;

        /** if start is null, break out
         * else if, loop while the current isn't equal to null
         **/
        if(start == null)
        {
            return;
        } else
        {
            /*** while current isn't equal to null, point node to next current ***/
            while(current != null)
            {
                index = current.next;

                /*** while index isn't null, swap ***/
                while(index != null)
                {
                    /** if the current node's data is greater than the index node's data, swap **/
                    if(current.data > index.data)
                    {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }

                current = current.next;
            }
        }
    }
}
