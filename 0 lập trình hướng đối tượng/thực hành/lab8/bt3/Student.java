
abstract  class Student 
{
    protected String name ;
    protected double gpa ;
    public Student(String name , double gpa)
    {
        setGpa(gpa);
        setName(name);
    }
     public void setGpa(double gpa) 
    {
        this.gpa =gpa;
    }
    public void setName(String name) 
    {
        this.name =name ;
    }
    public String getName()
    {
        return name ;
    }
    public double getGpa()
    {
        return gpa ;
    }
    abstract String getRank();


}