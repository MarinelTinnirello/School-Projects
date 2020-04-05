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
        LinkedList exlist = new LinkedList(8);

        exlist.Insertend(1);
        exlist.Insertend(5);
        exlist.Insertend(2);
        exlist.Insertend(7);
        exlist.Insertend(10);
        exlist.Insertend(3);

        exlist.Listprint();
        //output: 8 1 5 2 7 10 3
        exlist.Removemin();
        exlist.Listprint();
        //output should be: 8 5 2 7 10 3
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

    public void Removemin()
    {
        Node min = head;
        Node temp = head;
        Node prev = null;

        /** loop through nodes, checking for which element is the min **/
        while(temp != null)
        {
            if(temp.next != null && temp.next.data < min.data)
            {
                min = temp.next;
                prev = temp;
            }

            temp = temp.next;
        }
        
        if(min != head)
        {
            prev.next = min.next;
        } else
        {
            head = head.next;
        }
    }
}
