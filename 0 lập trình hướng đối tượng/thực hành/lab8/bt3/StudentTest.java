import java.lang.Math ;
import java.util.ArrayList;
public class  StudentTest
{
    
   public  ArrayList<Student> findStudent(ArrayList<Student> lstStu)
   {    ArrayList<Student> Passed = new  ArrayList <Student>() ;
       for( int i=0 ;i< lstStu.size();i++)
       {
           if(lstStu.get(i).getRank().equals("A")||lstStu.get(i).getRank().equals("Passed"))
           {
               Passed.add(lstStu.get(i));
           }
       }
       return Passed ;
   }
   public static void main(String [] args)
   {
       ArrayList <Student>  ap = new ArrayList <Student>(); 
        ap.add(new ITstudent("phuc",5,3423));
        ap.add(new ITstudent("phuc",10,100));
        ap.add(new ITstudent("phuc",10,100));
        ap.add(new Mathstudent("phuc",8,"thi is the thing "));
        System.out.println(ap.size());
        System.out.println(ap.get(1).getRank());
        ArrayList <Student>  first = new ArrayList <Student>(); 
        StudentTest passes  = new StudentTest();
        first = passes.findStudent(ap);
        
         System.out.println(first.size());
        for(int i =0 ; i< first.size();i++)
            System.out.println(first.get(i).getRank());

   }
}