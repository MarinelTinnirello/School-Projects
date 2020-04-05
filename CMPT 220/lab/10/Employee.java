public abstract class Employee
{
    String name;
    double age;
    double hourRate;

    public abstract double salary(double hours);

    public String getName()
    {
        return name;
    }

    public double getAge()
    {
        return age;
    }

    public double getHourRate()
    {
        return hourRate;
    }

    public String toString()
    {
        return "name = " + name + " age = " + age + " hourRate = " + hourRate;
    }
}