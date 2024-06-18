public class Staff  extends Person 
{
    private String school ; 
    private double pay ; 
    public Staff(String name , String address , String school , double pay)
    {
        super(name, address);
        setSchool(school);
        setPay(pay);

    }
    public void  setPay(double pay)
    {
        this.pay = pay;
    }
    public void setSchool(String school)
    {
        this.school = school ;
    }
    public String getSchool()
    {
        return school ;
    }
    public double  getPay()
    {
        return pay ;
    }
    @Override 
    public String toString()
    {
        return pay + school + pay ;
    }
}