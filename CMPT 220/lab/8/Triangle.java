import java.util.Scanner;

public class Triangle extends GeometricObj
{
    private double side1;
    private double side2;
    private double side3;

    public static void main (String[] args)
    {
        double side1, side2, side3;
        String color;
        boolean fill;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter color:    ");
        color = input.nextLine();

        System.out.println("Enter sides:    ");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();

        System.out.println("Fill triangle:  ");

        fill = input.nextBoolean();

        Triangle tri = new Triangle(side1, side2, side3);

        tri.setColor(color);
        tri.setFill(fill);

        System.out.println("Sides of:   " + tri.toString());
        System.out.println("Area:       " + tri.getArea());
        System.out.println("Perimeter:  " + tri.getPerimeter());
        System.out.println("Is filled:  " + tri.isFilled());
    }

    public Triangle(double side1, double side2, double side3)
    {
        side1 = side1;
        side2 = side2;
        side3 = side3;
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }

    public double getArea()
    {
        double s = (side1 + side2 + side3) / 2;
        double area  = s * (s - side1) * (s - side2) * (s - side3);

        return  area;
    }

    public double getPerimeter()
    {
        return (side1 + side2 + side3);
    }

    public String toString()
    {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
