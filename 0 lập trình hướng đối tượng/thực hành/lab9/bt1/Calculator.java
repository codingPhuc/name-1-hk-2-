import java.util.*;
public class Calculator {
    public  static double divide(int a , int b) throws  ArithmeticException , NumberOutOfRangeException
    {
        if(b==0)
        {
           throw new ArithmeticException ("divide by zero");
        }
        if( a<-1000||a>1000 ||b<-1000||b>1000  )
        {
            throw new NumberOutOfRangeException("Number is outside the computation");
        }
        return (double)a /b;
    }
    public static int multiply(int a , int b) throws NumberOutOfRangeException
    {
        if( a<-1000||a>1000 ||b<-1000||b>1000  )
        {
            throw new NumberOutOfRangeException("Number is outside the computation");
        }
        return a*b ;
    }
    public static void main(String [] args) throws ArithmeticException , NumberOutOfRangeException
    {   int flag =1 ; 
        Scanner sc = new Scanner(System.in);
         double div =0;
        int mul=0 ;
        do
        {
            try {
                int a = sc.nextInt() ;
                int b= sc.nextInt() ;
                div =divide(a,b);
                mul =multiply(a,b);
                flag=2 ;
            }
            catch(NumberOutOfRangeException  e){
                System.out.println(e);
            }
             catch(ArithmeticException a){
                System.out.println(a);
            
        }
        }while(flag == 1);
    System.out.println(div);
    System.out.println(mul);
}
}