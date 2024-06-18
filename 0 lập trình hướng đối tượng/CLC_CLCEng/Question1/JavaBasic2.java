import java.util.*;
import java.util.StringTokenizer;    
public class JavaBasic2{
    public static String getMiddleName(String fullName) {    
    int firstSpace = fullName.indexOf(" ");                
    int lastSpace = fullName.lastIndexOf(" ");             
    String middleName = fullName.substring(firstSpace,lastSpace); 
    return middleName;  
} 

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your full name: ");
    String fullName = input.nextLine();

         
    System.out.println(getMiddleName(fullName));  
}

}