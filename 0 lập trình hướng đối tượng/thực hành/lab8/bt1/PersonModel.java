import java.util.ArrayList;
    public class PersonModel <T> 
    {
    private ArrayList<T> al = new ArrayList<T>();
     public void add(T obj) 
    {
        al.add(obj);
    }
    public void display() 
    {
        for (T obj : al) 
        {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) 
    {
        PersonModel<Person>  phuc = new  PersonModel <Person>();
        phuc.add(new Person(" phuc",19));
        phuc.add(new Person(" hey",1));
        phuc.display();
        PersonModel<Student>  hello = new  PersonModel <Student>();
        hello.add(new Student(" phuc",19,"323",323));
        hello.add(new Student(" hey",1,"gt3",55));

        hello.display();
        
        
    }
}