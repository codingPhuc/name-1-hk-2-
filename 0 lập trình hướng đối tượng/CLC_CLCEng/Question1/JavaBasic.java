import java.util.*;
import java.util.StringTokenizer;    
public class JavaBasic{
    public static int sumNegativeElements(int arr[]){
        int sum =0 ;
        for(int i=0 ; i< arr.length; i++)
        {
            if(arr[i]<0)
                sum =sum + arr[i];
        }
        return sum ;
    }

    public static String uppercaseFirstVowels(String str){
       boolean check= false ;
     char[] chars = str.toLowerCase().toCharArray();
     for(int i=0 ;i< chars.length ; i++)
     {
        if(!check && Character.isLetter(chars[i]))
        {
            chars[i]=Character.toUpperCase(chars[i]);
            check= true ;
        }
        else if(Character.isWhitespace(chars[i])&& (chars[i+1]!= 'a')&& (chars[i+1]!= 'u')&& (chars[i+1]!= 'i')&& (chars[i+1]!= 'o'))
        {
             check = false ;
        }

     }
     return String.valueOf(chars);

    }
    
	
	public static int findMinNegativeElement(int a[]){
        int min = a[0];
        for(int i=0 ; i<a.length; i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        return min;
    }
	
	public static String getName(String str){
        StringTokenizer st = new StringTokenizer(str,":");
        boolean check = true ;
        String nes= "";
        
        nes= st.nextToken();  
        nes= st.nextToken();
        return nes ;
    }

    public static int findFirstMod3Element(int[] a){
        
        for(int i =0 ; i< a.length ; i++)
        {
            if(a[i]%3==0)
                return a[i];
        }
        return -1 ;
    }

    public static int countString(String str, String k){
        
        StringTokenizer st = new StringTokenizer(str," ");
        int count=0; 
        while(st.hasMoreTokens())
        {
            if(st.nextToken().equals(k))
                count ++;
        }   
        return count ;
    }

    public static void main(String[] args){
        int a[] = {1,-2,3,4,-2,1,-9};
        System.out.printf("%d",sumNegativeElements(a));
        String s = "nguyen thi uyen an";
        String name =uppercaseFirstVowels(s);
        System.out.printf(name);
        System.out.printf("\n%d",findFirstMod3Element(a));
        System.out.printf("\n%d",findMinNegativeElement(a));
        
		String s1 = "Name: Le Thi Thu Thao";
        s=  getName(s1);
        System.out.println(s);
        String s2 = "Nguyen Thi Oanh Oanh";
        countString(s2,"Oanh");
        System.out.printf("\n%d",countString(s2,"Oanh"));
        //Test all of methods which you implemented
    }

}