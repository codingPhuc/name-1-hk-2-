import java.util.*;

public class bai7lab1{
    public static boolean number(char a)
    {
        return Character.isDigit(a);
    }
    public static int numbers()
    {
        System.out.printf("a");
        return 0;
    }
    
    public static void main(String [] args)
    {    Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        Boolean flag = number(c);
        if(flag) {
            System.out.println("'"+ c+"' is a number");
         }
        else {
            System.out.println("'"+ c+"' is a letter");
         }
         numbers;
    }
    
}