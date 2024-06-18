import java.util.*;

public class lab3 {

    public static void main(String [] args)
    {
        StringBuffer sb = new StringBuffer("Hello");
        sb.reverse();
       System.out.println(sb);//prints
       sb.append("this is your name");
       System.out.println(sb);
       String a= "this is it";
       System.out.println(a);
        sb.replace(1,3,a);
        System.out.println(sb);
        String b= sb.substring(4);
        
        System.out.println(b);
    }

    
} 

