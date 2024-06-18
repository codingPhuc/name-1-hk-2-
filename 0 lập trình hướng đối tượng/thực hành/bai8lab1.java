import java.util.*;
public class bai8lab1{
    public static Float sum(float a)
    {   float sum=0;
        for(int i=0 ;i<a;i++)
            {
                sum=sum +i;
            }
            return sum ;

    }
     public static Float sum1(float a)
    {   float sum=1;
        for(int i=1 ;i<a;i++)
            {
                sum=sum *i;
            }
            return sum ;

    }
     public static Float sum2(float a)
    {   float sum=0;
        for(float i=0 ;i<a;i++)
            {
                sum=sum + (float)Math.pow(2,i);
            }
            return sum;

    }
    public static Float sum3(float a)
    {   float sum=0;
        for(float i=1 ;i<a;i++)
            {
                sum=sum +  (float)1/(2*i);
            }
            return sum;

    }
    public static Float sum4(float a)
    {   float sum=0;
        for(int i=0 ;i<a;i++)
            {
                sum=sum+  (float)Math.pow(i,2);
            }
            return sum;

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        float a ;
        System.out.printf("pls enter a number \n");
        a = sc.nextFloat();
        System.out.printf("this is the  numbers: %f\n",sum(a));
        System.out.printf("this is the  numbers: %f\n",sum1(a));
        System.out.printf("this is the  numbers: %f\n",sum2(a));
        System.out.printf("this is the  numbers: %.6f\n",sum3(a));
        System.out.printf("this is the  numbers: %f\n",sum4(a));
    }
}