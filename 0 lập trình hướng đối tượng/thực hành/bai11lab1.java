import java.util.*;
public class bai11lab1{
    public static int sum(int a)
    {   int b=1;

        while(a>10)
        {
            a=a/10;
            b+=1;
        }
        return b;

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.printf("pls enter a number \n");
        a = sc.nextInt();
        System.out.printf("this is the nubmer of digit: %d",sum(a));
    }
}