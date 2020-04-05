public class Circle
{
    final double PI = 3.14;
    double radius;
    double x;
    double y;

    Circle()
    {
        x = 0;
        y = 0;
        radius = 0;
    }

    Circle(double x, double y, double radius)
    {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * PI * radius;
    }

    public double getDistance(double x2, double y2)
    {
        return Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
    }

    public boolean contains(double x2, double y2)
    {
        if(this.getDistance(x2, y2) < this.radius)
        {
            return true;
        }else
        {
            return false;
        }
    }

    public boolean contains(Circle circle)
    {
        if(this.radius<getDistance(circle.x, circle.y) && circle.radius>getDistance(circle.x, circle.y))
        {
            return true;
        }else
        {
            return false;
        }
    }

    public boolean overlaps(Circle circle)
    {
        if(getDistance(circle.x, circle.y) < circle.radius)
        {
            return true;
        }else
        {
            return false;
        }
    }
}
