import java.util.ArrayList;
import java.util.List;

public class Module
{
    String moduleName;
    String moduleID;
    ArrayList<Student> students;
    ArrayList<CourseProgramme> courses;
    Lecturer responsible;

    public Module(String moduleName, String moduleID, ArrayList<Student> students/*, Lecturer responsible*/)
    {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        this.students = students;
        //this.responsible = responsible;
    }

    public String getModuleName()
    {
        return moduleName;
    }

    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }

    public String getModuleID()
    {
        return moduleID;
    }

    public void setModuleID(String moduleID)
    {
        this.moduleID = moduleID;
    }

    public ArrayList<Student> getStudent()
    {
        return students;
    }

    public void setStudent(ArrayList<Student> student)
    {
        students = student;
    }

    public Lecturer getResponsible()
    {
        return responsible;
    }

    public void setResponsible(Lecturer responsible)
    {
        this.responsible = responsible;
    }

    public ArrayList<CourseProgramme> getCourseProgramme()
    {
        return courses;
    }

    public void setCourseProgramme(ArrayList<CourseProgramme> course)
    {
        courses = course;
    }
}
