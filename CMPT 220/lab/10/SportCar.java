public class SportCar implements Printable
{
    private String name;
    private int plate;

    public SportCar() { }

    public SportCar(String name, int plate)
    {
        this.name = name;
        this.plate = plate;
    }

    @Override
    public void print()
    {
        System.out.println("name  = " + name + " plate = " + plate);
    }
}
