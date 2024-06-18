import java.util.*;
import java.util.StringTokenizer;    
public class JavaBasic1{
    public static int idxFirstEven(int[] a){
       for(int i=0 ; i< a.length ; i++)
       {
           if(a[i]%2 ==0)
                return  i ;

       }
       return -1 ;
    }
    public static int [] input(int n){
         Scanner  sc = new Scanner(System.in);
        
        int a[] = new int[n];
       for(int i=0 ; i< n ; i++)
       {
           a[i] = sc.nextInt();
       }
       return a ;
    }

     public static int maxEven(int[] a){
         int max =  a[idxFirstEven(a)];
       for(int i=0 ; i< a.length ; i++)
       {
           if(a[i]%2 ==0&& max<a[i])
                max = a[i];

       }
       return max;
    }
     public static int idxFirstOdd(int[] a){
       for(int i=0 ; i< a.length ; i++)
       {
           if(a[i]%2 !=0)
                return  i ;

       }
       return -1 ;
    }
       public static int minOdd(int[] a){
         int min =  a[idxFirstOdd(a)];
       for(int i=0 ; i< a.length ; i++)
       {
           if(a[i]%2 !=0&& min>a[i])
                min = a[i];

       }
       return min;
    }
    public static int sumMEMO(int[] a){
       

       return minOdd(a) + maxEven(a);
    }
     public static int sumEven(int[] a){
         int sum =0 ; 
       for(int i=0 ; i< a.length ; i++)
       {
           if(a[i]%2 ==0 ) 
                sum = sum + a[i];

       }
       return sum;
    }
     public static int proOdd(int[] a){
         int sum =1 ; 
       for(int i=0 ; i< a.length ; i++)
       {
           if(a[i]%2 !=0 ) 
                sum = sum *a[i];

       }
       return sum;
    }


    public static void main(String[] args){

        Scanner  sc = new Scanner(System.in);
        System.out.printf("iput number of element : ");
        //int n = sc.nextInt();
        System.out.printf("\niput the element : ");
        //int a[]=input(n);
        int a[] = {3,4,2,3,1,2,3};
        System.out.printf("the sum of oddmin and evenmax is : %d\n" ,sumMEMO(a));
        System.out.printf("this is the sumeven : %d\n",sumEven(a));
        System.out.printf("this is the product odd: %d\n",proOdd(a));
    }

}