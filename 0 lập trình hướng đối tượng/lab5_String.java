import java.util.*;
import java.util.StringTokenizer;    
public class lab5_String{
    public static String first_Last(String str){
        String [] st = str.split(" ");
        if(st.length==1)
            return st[0];
        else if(st.length==2)
            return st[0]+" "+st[1];
        else     
            return st[st.length-1]+" "+ st[0];
    }
     public static String haskTask(String str){
        String [] st = str.split(" ");
         if(st.length==1)
            return "#"+st[0];
        else if(st.length==2)
            return "#"+st[0]+" "+st[1];
        else     
            return "#"+st[st.length-1]+ st[0];
        
    }
    public static String upperVowel(String str){
        char [] chars = str.toCharArray();
        for(int  i =0 ; i< chars.length ; i++)
        {
            if (chars[i] == 'a' ||chars[i]== 'e' ||
       chars[i] == 'i' ||chars[i] == 'o' ||
        chars[i] == 'u')
        
                chars[i]= Character.toUpperCase(chars[i]);
        }
        return String.valueOf(chars);
    }
    public static String upperNletter(String str){
        char [] chars = str.toCharArray();
        for(int  i =0 ; i< chars.length ; i++)
        {
            if (chars[i] == 'n' )
        
                chars[i]= Character.toUpperCase(chars[i]);
        }
        return String.valueOf(chars);
    }

    
    


    public static void main(String[] args){

        String str =  "Nguyen Le Trong Tin";
        String st = first_Last(str);
        
        System.out.printf(st);
        System.out.printf("\n");
        System.out.printf(haskTask(str));
        System.out.printf("\n");
         System.out.printf(upperVowel(str));
          System.out.printf("\n");
         System.out.printf(upperNletter(str));
        
    }

}