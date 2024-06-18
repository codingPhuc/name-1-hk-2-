import java.util.*;
import java.util.StringTokenizer;    
public class test{
    public static int first_Last(String str){
         String [] st = str.split("\\W+");
         int count=0 ;
        for(int i =0 ; i<st.length;i++)
            {
                count++;
            }
        return count ;
    }
     public static int countSentance(String str){
         String [] st = str.split(",");
        
         int count=0 ,plus=0;
        for(int i =0 ; i<st.length;i++)
            {
                count++;
            }
        
        return plus;
    }
    public static int countDup(String str,String sta){
         String [] st = str.split("\\W+"); 
         int count=0 ;
        for(int i =0 ; i<st.length;i++)
            {   if(st[i].toLowerCase().equals(sta))
                    count++;
            }
        return count ;
    }

    public static void main(String[] args){

        String str =  "The   Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        String [] st = str.split("\\s+"); 
        for(int i =0 ; i<st.length;i++)
            {  
                System.out.println(st[i]);
            } 


        
        
    }

} 