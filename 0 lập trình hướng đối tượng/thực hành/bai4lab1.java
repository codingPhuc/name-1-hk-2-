import java.util.*;

public class bai4lab1{
    public static int number(int a)
    {
        return  (a - 32) * 5/9;
    }
    public static void main(String [] args)
    {   Scanner sc = new Scanner(System.in);
        int numbers ;
        numbers = sc.nextInt();
        System.out.println(number(numbers) );
    }
    
}