public class Employee{
    protected String ID ;
    protected String fullname ;
    protected int  yearJoined ; 
    protected double cofficientsSalary ;
    protected int numDayOff ; 
    public Employee()
    {
        this.ID = "0" ;
        this.fullname = "";
        this.yearJoined = 2020 ;
        this.cofficientsSalary = 1.0 ; 
        this.numDayOff = 0 ;
    }
    public Employee(String ID , String fullname ,double cofficientsSalary)
    { 
        this.ID = ID ;
        this.fullname = fullname ;
        this.cofficientsSalary = cofficientsSalary ;
        this.yearJoined = 2020 ;
        this.numDayOff = 0 ;
    }
     public Employee(String ID , String fullname , double cofficientsSalary,int numDayOff ,int yearJoined)
    { 
        this.ID = ID ;
        this.fullname = fullname ;
        this.cofficientsSalary = cofficientsSalary ;
        this.yearJoined = yearJoined ;
        this.numDayOff = numDayOff ;
    }
    public double getSenioritySalary()
    {
        if(2022 - this.yearJoined >5)
        {
            return (2022-this.yearJoined)*1150 /100;
        }
        else 
            return 0 ;
        
    }
    public String considerEmulation()
    {
        if(this.numDayOff <= 1)
        {
            return "A";
        }
        else if(this.numDayOff >=1 && this.numDayOff <=3)
        {
            return "B";
        
        }
        else 
        {
            return "C";
        }
    }
    public double getSalary()
    {
        String dayoff = considerEmulation();
        double slary=0 ;
        if(dayoff.equals("A"))
        {
            slary =  1150 +1150*(cofficientsSalary+ 1.0) + getSenioritySalary();
        }
        else if(dayoff.equals("B"))
        {
           slary = 1150 +1150*(cofficientsSalary+ 0.75) + getSenioritySalary();
        }
        else 
        {
            slary = 1150 +1150*(cofficientsSalary+ 0.50) + getSenioritySalary();
        }
        return slary ;
    }

}