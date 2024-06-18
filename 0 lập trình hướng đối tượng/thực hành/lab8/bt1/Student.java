public class Student extends Person 
{
   
	private String id;
	private int score  ;
    public Student(String name, int birth ,String id, int score)
    {   
        super(name , birth);
        this.id= id ;
        this.score = score ;
    }
	public String getId() 
	{
		return this.name;
	}
	public int getScore()
	{
		return this.score ;
	}
	public void setId (String id)
	{
		this.id = id ;
    }
    public void setScore(int score  )
    {
        this.score = score ;
    }
    @Override 
    public String toString()
    {
        return "name: " + this.id +"birth year: "+this.score+"name " + super.name +"birth: " +super.birth;
    }
    


}