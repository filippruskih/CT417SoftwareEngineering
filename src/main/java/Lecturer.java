import org.joda.time.DateTime;

public class Lecturer
{
    String lecturerName;
    int lecturerAge;
    DateTime lecturerDob;
    int lecturerID;
    String lecturerUsername;
    String modulesTeaching;

    public Lecturer(String lecturerName, int lecturerAge, DateTime lecturerDob, int lecturerID, String lecturerUsername/*, String modulesTeaching*/)
    {
        this.lecturerName = lecturerName;
        this.lecturerAge = lecturerAge;
        this.lecturerDob = lecturerDob;
        this.lecturerID = lecturerID;
        this.lecturerUsername = lecturerUsername;
        //this.modulesTeaching = modulesTeaching;
    }

    public String getLecturerName()
    {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }

    public int getLecturerAge()
    {
        return lecturerAge;
    }

    public void setLecturerAge(int lecturerAge)
    {
        this.lecturerAge = lecturerAge;
    }

    public DateTime getLecturerDob()
    {
        return lecturerDob;
    }

    public void setLecturerDob(DateTime lecturerDob)
    {
        this.lecturerDob = lecturerDob;
    }

    public int getLecturerID()
    {
        return lecturerID;
    }

    public void setLecturerID(int lecturerID)
    {
        this.lecturerID = lecturerID;
    }

    public String getLecturerUsername()
    {
        lecturerUsername = lecturerName+lecturerAge; //concatenates the lecturerName and lecturerAge to create a lecturerUsername
        return lecturerUsername;
    }

    public void setLecturerUsername(String lecturerUsername)
    {
        this.lecturerUsername = lecturerUsername;
    }

    public String getModulesTeaching()
    {
        return modulesTeaching;
    }

    public void setModulesTeaching(String modulesTeaching)
    {
        this.modulesTeaching = modulesTeaching;
    }
}
