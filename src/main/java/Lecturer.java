import org.joda.time.DateTime;

public class Lecturer
{
    String lecturerName;
    String lecturerSurname;
    int lecturerAge;
    DateTime lecturerDob;
    int lecturerID;
    String lecturerUsername;
    String modulesTeaching;

    public Lecturer(String lecturerName, String lecturerSurname, int lecturerAge, DateTime lecturerDob, int lecturerID/*, String lecturerUsername/*, String modulesTeaching*/)
    {
        this.lecturerName = lecturerName;
        this.lecturerSurname = lecturerSurname;
        this.lecturerAge = lecturerAge;
        this.lecturerDob = lecturerDob;
        this.lecturerID = lecturerID;
        this.lecturerUsername = lecturerUsername;
    }

    public String getLecturerName()
    {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }

    public String getLecturerSurname()
    {
        return lecturerSurname;
    }

    public void setLecturerSurname(String lecturerSurname)
    {
        this.lecturerSurname = lecturerSurname;
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
        lecturerUsername = lecturerName+lecturerSurname+lecturerAge; //concatenates the first and surname and lecturerAge to create a lecturerUsername
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
