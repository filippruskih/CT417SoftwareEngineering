import assignment1package.Lecturer;
import assignment1package.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTestClass
{
    Student s1 = new Student("Fil", "Ruskih", 23, DateTime.parse("1999-06-06"), 19345561);
    Student s2 = new Student("Sam", "McCormack", 24, DateTime.parse("1998-04-24"), 18923341);
    Lecturer l1 = new Lecturer("Johny", "Burns", 55, DateTime.parse("1967-02-02"), 1234);

    public JUnitTestClass() {
    }

    //Test checks for the username generation which consists of name,surname and age
    //Also checks the student id is correct
    @Test
    public void testStudentData(){
        assertEquals("FilRuskih23", s1.getUsername());
        assertEquals(19345561, s1.getId());
        assertEquals("SamMcCormack24", s2.getUsername());
        assertEquals(18923341, s2.getId());
    }

    //Test checks for the username generation consisting of name, surname and age
    //Also checks the lecturer id is correct
    @Test
    public void testLecturerData(){
        assertEquals("JohnyBurns55", l1.getLecturerUsername());
        assertEquals(1234, l1.getLecturerID());
    }
}
