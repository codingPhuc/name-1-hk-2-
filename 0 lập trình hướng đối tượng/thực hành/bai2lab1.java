import java.util.* ;
public class bai2lab1{
    public static void main(String [] args)
    {   Scanner sc = new Scanner(System.in ); 
        System.out.printf("pls enter the hegiht of the triangle");
        float heght , width ;
        heght= sc.nextInt();
        System.out.printf("pls enter the wight of the triangle\n");
        width = sc.nextInt();
        float area = (heght*width)/2;
        System.out.printf("this is the arae of the triangle : %.6f",area);
    }
}