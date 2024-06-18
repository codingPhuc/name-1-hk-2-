import java.util.*;

public class bai1lab1{
    
           public static String capitalizeString(String string) {
  char[] chars = string.toLowerCase().toCharArray();
  boolean found = false;
  for (int i = 0; i < chars.length; i++) {
    if (!found && Character.isLetter(chars[i])) {
      chars[i] = Character.toUpperCase(chars[i]);
      found = true;
    } 
    else if (Character.isWhitespace(chars[i]) && (chars[i+1]!='a')&&(chars[i+1]!='o')&& (chars[i+1]!='i')&& (chars[i+1]!='u')&&(chars[i+1]!='e') ) { // You can add other chars here
      found = false;
    }
  }
  return String.valueOf(chars);
}
    public static void main(String [] args)
    {
        String name  = "stackoverflow ahuc ohuc this is the uare thing"; 
        String s1 = capitalizeString(name);
        char[] chars = name.toCharArray();
        for(int i=0 ; i<chars.length; i++)
        {
            System.out.print(chars[i]);
        }
        name = name.substring(0);
         System.out.printf("\n");
         System.out.printf(s1);
        
    }
    
}
