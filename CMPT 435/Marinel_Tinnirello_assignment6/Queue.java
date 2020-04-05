import java.util.LinkedList;

class Queue {

    private LinkedList queuelist;

    public Queue()
    {
        queuelist = new LinkedList<Integer>();
    }

    //enqueue
    public void insert(int j)
    {
        queuelist.add(j);
    }

    //dequeue
    public int remove()
    {
        return (int)queuelist.remove();
    }

    public boolean isEmpty()
    {
        return queuelist.isEmpty();
    }
}
