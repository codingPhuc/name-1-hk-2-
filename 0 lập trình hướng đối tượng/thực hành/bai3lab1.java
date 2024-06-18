import java.util.*;

public class bai3lab1{
    public static int number(int a)
    {
        return a%10 ;
    }
    public static void main(String [] args)
    {   Scanner sc = new Scanner(System.in);
        int numbers ;
        numbers = sc.nextInt();
        System.out.println(number(numbers) );
    }
    
}