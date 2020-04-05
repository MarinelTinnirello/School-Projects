public class TV extends Appliance
{
    public TV() {}

    public TV(double voltage, String color, String madeIn, double price)
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
