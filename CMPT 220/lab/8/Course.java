import java.util.ArrayList;

public class Course
{
    private String courseName;
    private ArrayList students;

    public Course(String courseName)
    {
        this.courseName = courseName;
        students = new ArrayList();
    }

    public void addStudent(String student)
    {
        students.add(student);
    }

    public ArrayList getStudents()
    {
        return students;
    }

    public int getNumOfStudents()
    {
        return students.size();
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void dropStudent(String student)
    {
        students.remove(student);
    }

    public String toString()
    {
        String s = "";

        s = courseName + (students.size() + " students \n");

        for(int i = 0; i < students.size(); i++)
        {
            s += students.get(i) + "\n";
        }

        return s;
    }

    public void clear()
    {
        students.clear();
    }
}
