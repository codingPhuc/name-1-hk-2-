import java.util.*;
public class test {
public static void main(String [] args)
{
    String fullName = "FirstName MiddleName this is LastName"; 
String[] s = fullName.split(" ");
    
// System.out.println("Get the length of the array middle position "+ s.length / 2);
    
String middleName = s[s.length/2];
System.out.println(middleName);
}

}



