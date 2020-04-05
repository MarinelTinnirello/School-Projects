public class Rectangle implements Printable
{
    private int length;
    private int width;

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public void print()
    {
        System.out.println("length = " + length + " width = " + width);
    }
}
