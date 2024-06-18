import java.util.*;
public class bai14lab1 {
    
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        int a=0;
        while(a!=5)
    {
          System.out.printf("*VENDING MACHINE*\n");
     System.out.printf("1.cola \n" , "$1.00");
     System.out.printf("2. Spirt\n" , "$1.00");   
     System.out.printf("3. Pepsi\n" , "$2.00");
     System.out.printf("4. Snack\n" , "$3.00");
     System.out.printf("5.  Shut down the machine \n");
    
     a = sc.nextInt();
        
    int b;
        switch (a) {
            case 1:
               System.out.println("cola is 1.00 pls enter the amount of money :");
                 b= sc.nextInt();
               if(b>1)
                    System.out.printf("this is your change %d \n",b-1);
                else 
                     System.out.println("not enough money to buy ");
                break;
            case 2:
                System.out.println("spirt is 1.00 pls enter the amount of money :");
               b= sc.nextInt();
               if(b>1)
                    System.out.printf("this is your change %d \n",b-1);
                else 
                     System.out.println("not enough money to buy ");
                break;
            case 3:
               System.out.println("pepsi is 2.00 pls enter the amount of money :");
                b= sc.nextInt();
               if(b>2)
                    System.out.printf("this is your change %d \n",b-2);
                else 
                     System.out.println("not enough money to buy ");
                break;
            case 4:
               System.out.println("snack is 3.00 pls enter the amount of money :");
                b= sc.nextInt();
               if(b>3)
                    System.out.printf("this is your change %d \n",b-3);
                else 
                     System.out.println("not enough money to buy ");
                break;
            case 5:
                System.out.printf("shutting down \n");
            }
        }

    }

}