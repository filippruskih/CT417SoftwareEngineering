package assignment1package;

import assignment1package.CourseProgramme;
import assignment1package.Lecturer;
import assignment1package.Student;

import java.util.ArrayList;

public class Module
{
    String moduleName;
    String moduleID;
    ArrayList<Student> students;
    ArrayList<CourseProgramme> courses;
    ArrayList<Lecturer> responsible;

    public Module(String moduleName, String moduleID, ArrayList<Student> students)
    {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        this.students = students;
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

    public ArrayList<Lecturer> getResponsible()
    {
        return responsible;
    }

    public void setResponsible(ArrayList<Lecturer> responsible)
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
