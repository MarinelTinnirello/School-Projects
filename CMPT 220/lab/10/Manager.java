public class Manager extends Employee implements Printable
{
    private String name;
    private double hourRate;

    public Manager()
    {
        super();
    }

    public Manager(String name, double age, double hourRate)
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

    @Override
    public void print()
    {
        System.out.println("name = " + name + " age = " + age);
    }

    public Manager(String name, double age)
    {
        this.name = name;
        this.age = age;
    }
}
