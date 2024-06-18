import java.util.*;

public class ApproximatePI {

    public static void main(String [] args)
    {
        int term , sign =1 , demon =1;
        double pi =0.0 ;
        Scanner sc = new Scanner(System.in ); 
        System.out.printf("enter number of terms : ");
        term = sc.nextInt();
        for(int i =0 ; i< term ; i++)
        {
            pi+= 4.0/demon*sign;
            sign*= -1 ;
            demon+= 2;

        }
        System.out.printf("PI= %.6f\n",pi);
    }

    
} 



    

    
    