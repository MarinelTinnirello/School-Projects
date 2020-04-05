/*********************
 Author: Marinel Tinnirello
 Lab 7 - Problem 11.5
 ********************/

import java.util.ArrayList;

public class TestCourse
{
    public static void main(String[] args)
    {
        Course c1 = new Course("Advanced Calculus");
        Course c2 = new Course("Metaphysics");

        c1.addStudent("Pytor");
        c1.addStudent("Tabitha");
        c1.addStudent("Griffith");
        c1.addStudent("Ignis");

        c2.addStudent("Zeke");
        c2.addStudent("Zelda");
        c2.addStudent("Raine");
        c2.addStudent("Faris");

        System.out.println("# of students in " + c1 + ":                " + c1.getNumOfStudents());
        ArrayList a1 = c1.getStudents();
        for(int i = 0; i < c1.getNumOfStudents(); i++)
        {
            System.out.print(a1.get(i) + ", ");
        }

        System.out.println();

        System.out.println("# of students in " + c2 + ":                " + c2.getNumOfStudents());
        ArrayList a2 = c2.getStudents();
        for(int i = 0; i < c2.getNumOfStudents(); i++)
        {
            System.out.print(a2.get(i) + ", ");
        }

        System.out.println();

        c1.dropStudent("Ignis");
        System.out.println("\nNew" + " list of" + c1 + " after a drop:   " + c1);

        c2.clear();
        System.out.println("\nNew" + " list of" + c2 + " after a clear:  " + c2);
    }
}
