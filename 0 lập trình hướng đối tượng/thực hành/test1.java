import java.util.*;
public class test1{
    public static void sum(int a)
    {    Scanner sc = new Scanner(System.in);
        int b;
        System.out.printf("pls enter a number \n");
        b = sc.nextInt();

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.printf("pls enter a number \n");
        a = sc.nextInt();
        sum(a);
        System.out.printf("this is the nubmer of digit: %d");
    }
}