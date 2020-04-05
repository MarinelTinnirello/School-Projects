public class MyLong
{
    long value;

    MyLong() {}

    MyLong(long value)
    {
        this.value = value;
    }

    public long getValue()
    {
        return value;
    }

    public boolean isEven()
    {
        if(value % 2 == 0)
        {
            return true;
        }
        return false;
    }

    public boolean isOdd()
    {
        if (value % 2 != 0)
        {
            return true;
        }
        return false;
    }

    public boolean isPrime()
    {
        int i = 0;

        for(i = 2; i <= value / 2; i++)
        {
            if (value % i != 0)
            {
                return true;
            }
        }
        return false;
    }

    public boolean isEven(long value)
    {
        if (value % 2 == 0)
        {
            return true;
        }
        return false;
    }

    public boolean isOdd(long value)
    {
        if(value % 2 != 0)
        {
            return true;
        }
            return false;
    }

    public static boolean isPrime(long value)
    {
        return isPrime(value);
    }

    public static boolean isEven(MyLong myLong)
    {
        return myLong.isEven(myLong.getValue());
    }

    public static boolean isOdd(MyLong myLong)
    {
        return myLong.isOdd(myLong.getValue());
    }

    public static boolean isPrime(MyLong myLong)
    {
        return myLong.isPrime(myLong.getValue());
    }

    public boolean equals(long longValue)
    {
        return value == longValue;
    }

    public boolean equals(MyLong myLong)
    {
        return equals(myLong.getValue());
    }
    
    public static long parseLong(char[] values)
    {
        long sum = 0;
        for (char i : values)
        {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static long parseLong(String s)
    {
        return Long.parseLong(s);
    }
}
