import java.util.*;

public class bai6lab1{
    public static float number(float a,float b,float c)
    {
        return  (a+b+c)/3;
    }
    public static void main(String [] args)
    {   Scanner sc = new Scanner(System.in);
        float num1,num2,num3;
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        num3 = sc.nextFloat();
        System.out.println(number(num1,num2,num3));
    }
    
}