public class Clerk extends Employee
{
    public Clerk()
    {
        super();
    }

    public Clerk(String name, double age, double hourRate)
    {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    @Override
    public double salary(double hours)
    {
        return hours * hourRate;
    }
}
