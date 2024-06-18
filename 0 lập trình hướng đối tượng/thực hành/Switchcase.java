public class SwitchCase {
    public static void switchcase(int  a) {
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();

        switch (number) {
            case 1:
               System.out.println("cola is 1.00 pls enter the amount of money :")
               int b= sc.nextInt();
               if(b>1)
                    System.out.println("this is your change %d",b-1);
                else 
                     System.out.println("not enough money to buy ");
                break;
            case 2:
                System.out.println("spirt is 1.00 pls enter the amount of money :")
               int b= sc.nextInt();
               if(b>1)
                    System.out.println("this is your change %d",b-1);
                else 
                     System.out.println("not enough money to buy ");
                break;
            case 3:
               System.out.println("pepsi is 2.00 pls enter the amount of money :")
               int b= sc.nextInt();
               if(b>2)
                    System.out.println("this is your change %d",b-2);
                else 
                     System.out.println("not enough money to buy ");
                break;
            case 4:
               System.out.println("snack is 3.00 pls enter the amount of money :")
               int b= sc.nextInt();
               if(b>3)
                    System.out.println("this is your change %d",b-3);
                else 
                     System.out.println("not enough money to buy ");
                break;
            case 5:
                System.out.println("shutting down ");
                break;

            default:
                System.out.println("Chạy vào khối default");
                break;
        }

    }
    public static void main(String[] args)
    {
     System.out.printf("%22s\n" ,"*VENDING MACHINE*");
     System.out.printf("1.cola \n" , "$1.00");
     System.out.printf("2. Spirt\n" , "$1.00");   
     System.out.printf("3. Pepsi\n" , "$2.00");
     System.out.printf("4. Snack\n" , "$3.00");
     System.out.printf("5.  Shut down the machine \n");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    switchcase(a);

    }

}