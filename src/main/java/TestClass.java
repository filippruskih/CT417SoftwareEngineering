import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.checkerframework.checker.units.qual.A;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;

public class TestClass
{
    /*
    public static void main(String[] args)
    {
        assignment1package.Student s1 = new assignment1package.Student("Filipp", "Ruskih", 23, DateTime.parse("1999-06-06"), 19345561/*, "CSIT"*///);
        /*assignment1package.Student s2 = new assignment1package.Student("Sam", "Mc", 24, DateTime.parse("1998-09-12"), 19871831);
        assignment1package.Student s3 = new assignment1package.Student("Gearoid", "Ryan", 19, DateTime.parse("2000-12-31"), 19871831);
        ArrayList<assignment1package.Student> students = new ArrayList<assignment1package.Student>(List.of(s1, s2, s3));

        assignment1package.Module m1 = new assignment1package.Module("Machine Learning", "CT4101", students);
        assignment1package.Module m2 = new assignment1package.Module("Euclidean and Non Euclidean Geometry", "MA3101", students);
        assignment1package.Module m3 = new assignment1package.Module("Advanced Professional Skills", "CT436", students);
        assignment1package.Module m4 = new assignment1package.Module("Systems Modelling and Simulation", "CT561", students);

        ArrayList<assignment1package.Module> modules = new ArrayList<assignment1package.Module>(List.of(m1, m2, m3, m4));

        assignment1package.CourseProgramme c1 = new assignment1package.CourseProgramme("CSIT", new ArrayList<>(), new ArrayList<>(), DateTime.parse("2022-09-05"), DateTime.parse("2023-09-04"));
        assignment1package.CourseProgramme c2 = new assignment1package.CourseProgramme("BUS", new ArrayList<>(), new ArrayList<>(), DateTime.parse("2022-09-05"), DateTime.parse("2023-09-04"));
        assignment1package.CourseProgramme c3 = new assignment1package.CourseProgramme("SCI", new ArrayList<>(), new ArrayList<>(), DateTime.parse("2022-09-05"), DateTime.parse("2023-09-04"));
        ArrayList<assignment1package.CourseProgramme> courseProgrammes = new ArrayList<assignment1package.CourseProgramme>(List.of(c1, c2, c3));

        assignment1package.Lecturer l1 = new assignment1package.Lecturer("John Burns", 55, DateTime.parse("1969-07-07"), 1234, "Jburns1");
        assignment1package.Lecturer l2 = new assignment1package.Lecturer("Frank Glavin", 35, DateTime.parse("1983-07-07"), 4321, "Fglavin1");
        ArrayList<assignment1package.Lecturer> lecturers = new ArrayList<assignment1package.Lecturer>(List.of(l1, l2));

        //Adding courses to students
        s1.setCourse(new ArrayList<assignment1package.CourseProgramme>(List.of(c1)));
        s2.setCourse(new ArrayList<>(List.of(c2)));
        s3.setCourse(new ArrayList<assignment1package.CourseProgramme>(List.of(c1, c3)));

        //Adding modules to students
        s1.setModules(new ArrayList<assignment1package.Module>(List.of(m1, m2)));
        s2.setModules(new ArrayList<assignment1package.Module>(List.of(m1, m3)));
        s3.setModules(new ArrayList<assignment1package.Module>(List.of(m3, m4)));

        //Adding students to modules
        m1.setStudent(new ArrayList<assignment1package.Student>(List.of(s1, s2)));
        m2.setStudent(new ArrayList<assignment1package.Student>(List.of(s1)));
        m3.setStudent(new ArrayList<assignment1package.Student>(List.of(s2, s3)));
        m4.setStudent(new ArrayList<assignment1package.Student>(List.of(s3)));

        //Adding courses to modules
        m1.setCourseProgramme(new ArrayList<>(List.of(c1)));
        m2.setCourseProgramme(new ArrayList<>(List.of(c1, c3)));
        m3.setCourseProgramme(new ArrayList<>(List.of(c1)));
        m4.setCourseProgramme(new ArrayList<>(List.of(c1)));

        //Adding students to courses
        c1.setStudent(new ArrayList<assignment1package.Student>(List.of(s1, s3)));
        c2.setStudent(new ArrayList<assignment1package.Student>(List.of(s2)));
        c3.setStudent(new ArrayList<assignment1package.Student>(List.of(s1, s3)));

        //Adding modules to courses
        c1.setModule(new ArrayList<assignment1package.Module>(List.of(m1, m2, m3, m4)));
        //c2.setModule(new ArrayList<assignment1package.Module>(List.of(m1)));
        c3.setModule(new ArrayList<assignment1package.Module>(List.of(m2)));

        //l1.setLecturer(new ArrayList<assignment1package.Lecturer>(List.of(s1, s2)));

        System.out.println("assignment1package.Student Data\n");
        for (assignment1package.Student s : students)
        {
            System.out.println("Name: " + s.getName() + " " + s.getSurname());
            System.out.println("Age: " + s.getAge());
            System.out.println("DOB: " + s.getDob().toString("yyyy-MM-dd"));
            System.out.println("ID: " + s.getId());
            System.out.println("Username: " + s.getUsername());
            System.out.println("Courses: ");
            for (assignment1package.CourseProgramme c : s.getCourse())
            {
                System.out.println(" " + c.getCourseName());
            }
            System.out.println("Modules: ");
            for (assignment1package.Module m : s.getModules())
            {
                System.out.println(" " + m.getModuleName());
            }
            /*System.out.println("Lecturers: ");
            for(assignment1package.Lecturer l: s.getLecturer())
            {
                System.out.println(" "+l.getLecturerName());
            }*/
            /*System.out.println("\n");
        }


    }*/


}

