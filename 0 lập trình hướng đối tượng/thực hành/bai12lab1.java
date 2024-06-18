 import java.util.*;
public class bai12lab1{
    public static int sum(int a)
    {   int sum=0;
        int b;
        while(a>0)
        {  
             
            b =a%10;
            a= a/10 ;
            sum= sum*10 +b;
        }
        return sum;

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.printf("pls enter a number \n");
        a = sc.nextInt();
        System.out.printf("this is the revere numbers: %d",sum(a));
    }
}