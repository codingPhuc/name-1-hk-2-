import java.math.BigDecimal;
import java.util.*;

public class lab3_2 
{  
public static String getMiddleName(String middleName) {    
     
    String[] s = middleName.split(" ");
    String name = s[s.length/2];
    return name;
} 
public static String capitalizeWord(String str){  
    String words[]=str.split("\\s");  
    String capitalizeWord="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
    }  
    return capitalizeWord.trim();  
}  
    public static String firstAndLastName(String name)
    {
       String[] names = name.split(" ");
       return names[0].concat(names[names.length-1]);

    }
    static void conVowUpp(char[] str)
{
  int N = str.length;
 
  for (int i = 0; i < N; i++)
  {
    if (str[i] == 'a' || str[i] == 'e' ||
        str[i] == 'i' || str[i] == 'o' ||
        str[i] == 'u')
    {
      char c = Character.toUpperCase(str[i]);
      str[i] = c;
    }
  }
  for(char c : str)
    System.out.print(c);
}
    public static void main(String [] args)
    { 
      
        String name = "nguyen Hoang phuc Phuc";
        
        System.out.println(firstAndLastName(name));
        System.out.println(getMiddleName(name));
        System.out.println(capitalizeWord(name));
        conVowUpp(name.toCharArray());
    }
}
