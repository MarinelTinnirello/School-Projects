public class Telephone extends Appliance
{
    public Telephone() {}

    public Telephone(double voltage, String color, String madeIn, double price)
    {
        super(voltage, color, madeIn, price);
    }

    @Override
    public double getVoltage()
    {
        return super.getVoltage();
    }

    @Override
    public String getColor()
    {
        return super.getColor();
    }

    @Override
    public double getPrice()
    {
        return super.getPrice();
    }
}
