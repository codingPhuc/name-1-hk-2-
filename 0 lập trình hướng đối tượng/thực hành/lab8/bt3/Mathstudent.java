public class Mathstudent extends Student 
{
    private String sID ;
    public  Mathstudent(String name, double gpa, String sID)
    {
        super(name,gpa);
        setSID(sID);
    }
    public void setSID(String sID)
    {
        this.sID = sID ;
    }
    public String getSID()
    {
        return this.sID ;
    }
    public String getRank()
    {
        if(gpa<5 )
            return "Failed";
        return "Passed";
    }
}