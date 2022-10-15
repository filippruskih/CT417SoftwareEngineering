package assignment1package;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme
{
    String courseName;
    ArrayList<Module> modules;
    ArrayList<Student> students;
    DateTime startDate;
    DateTime endDate;

    public CourseProgramme(String courseName, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate)
    {
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModule()
    {
        return modules;
    }

    public void setModule(ArrayList<Module> module)
    {
        modules = module;
    }

    public ArrayList<Student> getStudent()
    {
        return students;
    }

    public void setStudent(ArrayList<Student> student)
    {
        students = student;
    }

    public DateTime getStartDate()
    {
        return startDate;
    }

    public void setStartDate(DateTime startDate)
    {
        this.startDate = startDate;
    }

    public DateTime getEndDate()
    {
        return endDate;
    }

    public void setEndDate(DateTime endDate)
    {
        this.endDate = endDate;
    }
}
