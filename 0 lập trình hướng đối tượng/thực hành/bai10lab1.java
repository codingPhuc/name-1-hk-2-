import java.util.*;
public class bai10lab1{
    public static int sum(int a)
    {   int b;
        b = a%10;
        while(a>10)
        {
            a=a/10;
        }
        return b+a;

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.printf("pls enter a number \n");
        a = sc.nextInt();
        System.out.printf("this is the sum : %d",sum(a));
    }
}