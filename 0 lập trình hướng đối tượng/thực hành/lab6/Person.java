public class Person
{
    protected String name ;
    protected String address ; 
    public Person(String name , String address)
    {
        setAddress(address);
        this.name = name ;
    }
    public void setAddress(String address)
    {
        this.address = address ;
    }
    public String getName()
    {
        return name ;
    }
    public String getAdderss()
    {
        return address ;
    }
    @Override 
    public String toString()
    {
        return address + " " + name ;
    }
}