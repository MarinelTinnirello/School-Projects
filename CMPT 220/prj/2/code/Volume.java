import java.lang.Math;

public class Volume
{
    double num1, num2, num3;

    public Volume(double num1, double num2, double num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double Circle()
    {
        double ans = (double) ((4 * Math.PI * Math.pow(num1, 3)) / 3);

        return ans;
    }

    public double Triangle()
    {
        double ans = (double) (0.5 * (num1 * num2 * num3));

        return ans;
    }

    public double Rectangle()
    {
        double ans = (num1 * num2 * num3);

        return ans;
    }
}
