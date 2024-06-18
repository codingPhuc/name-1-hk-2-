import java.util.*;
public class bai13lab1{
    public static boolean sum(int a)
    {   int sum=0;
        int b;
        int c =a;
        while(a>0)
        {  
             
            b =a%10;
            a= a/10 ;
            sum= sum*10 +b;
        }
        return sum==c;

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.printf("pls enter a number \n");
        a = sc.nextInt();
        if(sum(a))
            System.out.printf("this is the nubmer pardorm");
        else 
            System.out.printf("this is the not pardorm");
    }
}