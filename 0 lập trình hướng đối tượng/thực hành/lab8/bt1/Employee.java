public class Employee extends Person 
{
   
	private String id;
	private int salary  ;
    public Student(String id, int salary )
    {
        this.id= id ;
        this.salary = salary ;
    }
	public String getId() 
	{
		return id;
	}
	public int getSalary()
	{
		return salary ;
	}
	public void setId (String id)
	{
		this.id = id ;
    }
    public void setScore(int score  )
    {
        this.score = salary ;
    }
    @Override 
    public String toString()
    {
        return "id: " + this.id +"salary : "+this.salary ;
    }
    


}