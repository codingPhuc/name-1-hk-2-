import java.util.*;
import java.lang.String.*;
public class TestRandom{
    public static void  main(String args [])
    {
        int num1= (int) (Math.random()* 20)+51;
        System.out.println("num1 =" +num1);

        Random rnd = new Random();
        int num2 = rnd.nextInt(20) +51;
        System.out.println("num2= "+num2);
        
    }
}