import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student
{
    String name;
    String surname;
    int age;
    DateTime dob;
    int id;
    String username;
    ArrayList<CourseProgramme> course;
    ArrayList<Module> modules;
    ArrayList<Lecturer> lecturers;

    public Student(String name, String surname, int age, DateTime dob, int id/*, String username, String course/*, String modules*/)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dob = dob;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public DateTime getDob()
    {
        return dob;
    }

    public void setDob(DateTime dob)
    {
        this.dob = dob;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        username = name+surname+age; //concatenates the name and age to create a username
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public ArrayList<CourseProgramme> getCourse()
    {
        return course;
    }

    public void setCourse(ArrayList<CourseProgramme> course)
    {
        this.course = course;
    }

    public ArrayList<Module> getModules()
    {
        return modules;
    }

    public void setModules(ArrayList<Module> modules)
    {
        this.modules = modules;
    }

    /*public void setLecturer(ArrayList<Lecturer> lecturer)
    {
        lecturers = lecturer;
    }

    public ArrayList<Lecturer> getLecturer()
    {
        return lecturers;
    }*/
}
