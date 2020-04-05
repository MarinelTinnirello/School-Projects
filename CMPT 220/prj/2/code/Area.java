import java.lang.Math;

public class Area
{
    double num1, num2;

    public Area(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double Circle()
    {
        double ans = (double) (Math.PI * (num1 * num1));

        return ans;
    }

    public double Triangle()
    {
        double ans = (num1 + num2) / 2;

        return ans;
    }

    public double Rectangle()
    {
        double ans = num1 * num2;

        return ans;
    }
}
