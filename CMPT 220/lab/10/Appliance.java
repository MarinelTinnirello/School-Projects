import org.jetbrains.annotations.NotNull;

public class Appliance implements Comparable
{
    private double voltage;
    private String Color;
    private String madeIn;
    private double price;

    public Appliance() { }

    public Appliance(double voltage, String Color, String madeIn, double price)
    {
        this.voltage = voltage;
        this.Color = Color;
        this.madeIn = madeIn;
        this.price = price;
    }

    public double getVoltage()
    {
        return voltage;
    }

    public String getColor()
    {
        return Color;
    }

    public String getMadeIn()
    {
        return madeIn;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public int compareTo(@NotNull Object o)
    {
        return 0;
    }

    public String toString()
    {
        return "Voltage:  " + voltage + "     Color:  " + Color + "     Made in:  " + madeIn + "    Price:  " + price;
    }
}
