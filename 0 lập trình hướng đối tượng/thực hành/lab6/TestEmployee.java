public class TestEmployee 
{
    public static void main(String [] args)
    {   
        Employee em = new Employee("53434", "ngueyn hoang phuc" ,2,5,2000);
        System.out.printf("%d\n",em.yearJoined);
        System.out.println(em.getSenioritySalary());
        System.out.println(em.considerEmulation());
        System.out.println(em.getSalary());
    }
}