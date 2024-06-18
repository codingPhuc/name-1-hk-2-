import java.util.*;

public class exercises3{

    public static void main(String [] args)
    {   
        
        StringBuilder sb = new StringBuilder("Nguyen Hoang Phuc");
        StringTokenizer st =new StringTokenizer("Nguyen Hoang Phuc"," ");
        int a=0 ;
        while(st.hasMoreTokens())
        {  
            a +=1;
           
        }
        a+=1;
        System.out.printf("this is the number of word %d \n",a);
        System.out.println(sb);
    }

    
} 

