/*********************
 Author: Marinel Tinnirello
 Lab 7 - Problem 3
 ********************/

public class TestCourse
{
    public static void main(String[] args)
    {
        Course course = new Course("History of Rock");

        course.addStudent("King Crimson");
        course.addStudent("Joe Hawley");
        course.addStudent("Voltaire");

        course.dropStudent("Dio");

        System.out.println("Students in the course are");
        for(int i = 0; i < course.getNumberOfStudents(); ++i)
        {
            System.out.println(course.getStudents()[i]);
        }
    }
}
