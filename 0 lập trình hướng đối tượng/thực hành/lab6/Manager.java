public class  Manager extends Employee {
    private String position ;
    private String department ; 
    private double salaryCO;
    public Manager(){ 
        super();
        position = "head";
        department = "adminitrative";
        salaryCO = 5.0 ; 
    }
    public Manager(String ID , String fullname , double cofficientsSalary , String position , double salaryCO  ,String department)
    {
        super(ID , fullname , cofficientsSalary );
        this.position = position ;
        this.department = department ;
        this.salaryCO = salaryCO ;
    }
    public Manager(String ID , String fullname , double cofficientsSalary ,int yearJoined ,int numDayOff, String position ,double salaryCO , String department)
    {
        super(ID , fullname , cofficientsSalary , yearJoined ,numDayOff  );
        this.position = position ;
        this.department = department ;
        this.salaryCO = salaryCO ;

    }
    @Override 
    public String considerEmulation()
    {
        return "A";
    }
    public  double bonusByPosition()
    {
        return 1150*salaryCO ;
    }
    @Override 
    public double getSalary ()
    {
        return 1150+ 1150*(super.cofficientsSalary + 1.0)+ getSenioritySalary() + salaryCO ;
    }

}