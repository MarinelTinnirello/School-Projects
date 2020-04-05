public class IllegalTriangleException extends Exception
{
    public IllegalTriangleException()
    {
        super();
    }

    public IllegalTriangleException(String e)
    {
        super(e);
    }

    public IllegalTriangleException(String e, Throwable ex)
    {
        super(e, ex);
    }

    public IllegalTriangleException(Throwable ex)
    {
        super(ex);
    }
}