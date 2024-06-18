public class Person {
    protected String name ;
    protected int birth ;
    public Person (){
        this.name = " ";
        this.birth = 1 ;
    }
    public Person(String name , int birth )
    {
        setBirth(birth);
        setName(name);
   }
   public void setName(String name){
       this.name = name ;
   }
   public void setBirth(int birth)
   {
       this.birth = birth ;
   }
   public int getBirth()
   {
       return this.birth ;
   }
   public String name()
   {
       return this.name ;
   }
   @Override 
   public String toString()
   {
       return "name= "+ name + "birth= " +birth  ;
   }

}