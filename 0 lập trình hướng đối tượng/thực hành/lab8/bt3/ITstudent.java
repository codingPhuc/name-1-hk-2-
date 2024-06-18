public class ITstudent extends Student 
{
    private int sID ;
    public  ITstudent(String name, double gpa, int sID)
    {
        super(name,gpa);
        setSID(sID);
    }
    public void setSID(int sID)
    {
        this.sID = sID ;
    }
    public int getSID()
    {
        return this.sID ;
    }
    public String getRank()
    {
        if(gpa <= 5)
        {
            return "C";
        }
        else if(gpa <= 8)
        {
            return "B";
        }
        else 
            return "A";
        
    }
}