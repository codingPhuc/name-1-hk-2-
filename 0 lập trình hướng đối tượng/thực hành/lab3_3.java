import java.math.BigDecimal;
import java.util.*;
public class lab3_3

{  
    public static int wordLenght(String example)
    {
       int length = example.split(" ").length;
       return length;
    } 
    static boolean isPalindrome(String str)
    {
 
        
        int i = 0, j = str.length() - 1;
 
        
        while (i < j) {
 
            
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            
            i++;
            j--;
        }
 
        
        return true;
    }
    public static void main(String[] args)
    { 
        
        
       String example = "This is a good exercise"; 
    
       int length =wordLenght(example);
        int numbers= example.length();
         System.out.printf("%d\n",numbers);
        String s = example + " this is it";
         System.out.println(s);
       System.out.println("The string is " + length + " words long.");
        if(isPalindrome("ooo"))
        {
            System.out.println("is paradom");
        }
        else{
            System.out.println("is not");
        }
        
    }

}
