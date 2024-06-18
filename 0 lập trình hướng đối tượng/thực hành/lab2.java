import java.math.BigDecimal;
import java.util.*;
public class lab2 
{      
     public static void Print(int array[])  
    {  
    
        
        for(int i=0 ; i <array.length ; i++)
        {
         System.out.printf("%d ",array[i]);
        }

        
    }
    public static int[] numbers(int n)  
    {  
        Scanner sc =  new Scanner(System.in);
        int[] array = new int[n];  
        for(int i=0 ; i <array.length ; i++)
        {
            array[i]=sc.nextInt();  
        }

        return array;  
    }  
    public static int findMax(int array[])
    {   int max = array[0];
        for(int i =0 ;i<array.length ;i++ )
        {
            if (max<array[i])
            {
                max = array[i];
            }
        }
        return max ;
    }
    public static int findMin(int array[])
    {   int max = array[1];
        for(int i =0 ;i<array.length ;i++ )
        {
            if (max>array[i])
            {
                max = array[i];
            }
        }
        return max ;
    }
    public static int findmax1(int array[],int a)
    {   int max = array[0];
        for(int i =0 ;i<array.length ;i++ )
        {
            if (max<array[i]&& array[i]<a)
            {
                max = array[i];
            }
        }
        return max ;
    }
    public static int Sum(int array [])
    {
        int sum=0;
        for(int i=0 ;i <array.length ;i++)
        {
            if(array[i]%2==0)
            {
                sum = sum +array[i];
            }
        }
        return sum ;
    }
    public static int countfrequency(int array [],int n)
    {   int count=0;
        
        for(int i=0 ;i< array.length;i++)
        {   if(array[i]==n)
                count+=1;
        }
        return count;
    }
    public static int find(int array [], int k)
    {
        for(int i=0 ; i<array.length ;i++)
        {
            if(array[i]==k)
            {
                    return i;
            }

        }
        return -1 ; 
    }

    public static void  square(int array [])
    {
        for(int i=0 ; i<array.length ;i++)
        {
            array[i]=array[i]*array[i];
        }
        
    }
    public static int[] divnumber(int array [], int k)
    {
        int [] temp = new int[array.length];
        int j = 0; 
        for ( int i =0 ;i< array.length ;i++)
        { 
            if( array[i]%k==0)
            {
                temp[j]=array[i];
                j++;
            }
        }
       int [] ele = new int [j];
        for ( int i =0 ;i< j;i++)
        { 
            
        ele[i]=temp[i];
        }
        return ele;
    }
    public static int thirdlager(int array[])
    { int a =10000,n=0 ;
        for(int i =0 ;i<array.length ;i++ )
        {
            if (n<3)
            {
                a = findmax1(array,a);
                n++ ;
            }
        }
        return a;
    }
    public static void main(String[] args)
    {   Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");  
        int n=sc.nextInt();  
        int [] array =numbers(n);
        System.out.printf("this is the max : %d\n",findMax(array));
        System.out.printf("this is the min : %d\n",findMin(array));
        System.out.printf("this is the sum : %d\n",Sum(array));
        System.out.print("pls enter the number you want to count "); 
        int a=sc.nextInt(); 
        System.out.printf("this is the count : %d\n",countfrequency(array,a));
        System.out.printf("this is the first element position: %d\n",find(array,a));
        System.out.printf("this is the third largest : %d\n",thirdlager(array));
        square(array);
        Print(array);
        System.out.printf("\n");
        int [] temp =divnumber(array,a);
        Print(temp);
    }

}