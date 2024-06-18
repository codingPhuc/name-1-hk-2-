import java.util.*;
public class bai9lab1
{
    public static int number(int a)
    {
        if(a%2==0)
        {   
           
            return a/2;
        }
        else
        { 
            return 3*a+1;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        a=sc.nextInt();
        while(a!=1)
        {   a=number(a);
                if(a%2==0)
                {   
                
                   System.out.printf("a is an even number: %d\n", a);
                }
                else
                { 
                    System.out.printf("a is an uneven number: %d\n",a);
                }
               
      
        }
    }

}