public class StackOfIntegers
{
    private int[] elements;
    private int size;

    public StackOfIntegers()
    {
        elements = new int[10];
    }

    public StackOfIntegers(int size)
    {
        elements = new int[size];
    }

    public boolean empty()
    {
        return size == 0;
    }

    public int peek()
    {
        if (!empty())
        {
            return elements[size - 1];
        }
        return -1;
    }

    public int push(int value)
    {
        if (size >= elements.length)
        {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        return elements[size++] = value;
    }

    public int pop()
    {
        if (!empty())
        {
            size--;
            return elements[size];
        }
        return -1;
    }

    public int getSize()
    {
        return size;
    }
}
