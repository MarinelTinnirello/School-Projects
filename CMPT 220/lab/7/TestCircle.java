/*********************
 Author: Marinel Tinnirello
 Lab 7 - Problem 
 ********************/

public class TestCircle
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(2, 2, 5.5);

        System.out.println("Circle1 area: " + c1.getArea());
        System.out.println("Circle1 perimeter: " + c1.getPerimeter());
        System.out.println("Contains point (3, 3): " + c1.contains(3, 3));
        System.out.println("Contains circle centered at (4, 5) and radius 10.5:  " + c1.contains(new Circle(4, 5, 10.5)));
        System.out.println("Overlaps circle centered at (3, 5) and radius 2.3:   " + c1.overlaps(new Circle(3, 5, 2.3)));
    }
}

