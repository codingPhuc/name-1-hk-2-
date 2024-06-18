import java.math.BigDecimal;
import java.util.*;
public class lab3

{   public static void Print(int array[])  
    {  
    
        
        for(int i=0 ; i <array.length ; i++)
        {
         System.out.printf("%d ",array[i]);
        }

        
    }
    public static int findIndex(int[] arr , int n)
    {
        for(int i =0 ; i<arr.length ;i++)
        {
            if(arr[i]==n)
            {   
                return i;
            }
        }
        return -1 ;
    }
    public static int[] del(int []arr , int n)
    {
        int index = findIndex(arr,n);
        if(index == -1)
            return arr ;
        else {
            int[] temp = new int[arr.length -1];
            for(int i=0 ,j=0; i<arr.length ;i++)
            {
                if(i!=index)
                    temp[j++]= arr[i];
            }
            return temp ;
        }
        
    }
    public static int[] insert(int ele , int pos , int [] arr)
    {   
        for(int i =0 ;i< arr.length ;i++)
        {
            if(i==pos)
            {
                arr[i]= ele ;
            }
        }
        return arr;
    }
    public static int[] dublic(int [] arr )
    {   
        int[] demp = new int[arr.length];
        int index = 0;
        for(int i =0 ;i<arr.length;i++)
        {
            for(int j=0; j<arr.length ; j++)
            {
                if(arr[i]== arr[j]&&(i!=j))
                {
                    demp[index++] =arr[j];
                    
                }
            }
            
        }
        int [] result = new int[index];
        for(int i=0 ;i< index ;i++)
        {
            result[i] = demp[i];
        }
        return result;
    }
    
    public static void main(String [] args)
    { 
    
        int[] a= new int[] {1,3,1,3,2,4};
        int[] newarr = del(a,3);
        int [] dubarr= dublic(a);
         int [] insertnumber= insert(2,5,a);
         int [] dubdel= deldub(a);
        Print(newarr);
        System.out.printf("\n");
        Print(insertnumber);
        System.out.printf("\n");
        Print(dubarr);
        System.out.printf("\n");
        
    }
}
