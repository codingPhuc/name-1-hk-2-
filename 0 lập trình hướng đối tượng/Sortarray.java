import java.util.StringTokenizer;
import java.util.* ; 
public class Sortarray{
    public static int[] input(int n)
    { Scanner sc = new Scanner(System.in);
        int [] arr = new int[n];
        for(int i=0 ; i< n ; i++)
        {
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static void arraySorted(int [] arr)
    {int temp ,j;
        for(int i=0; i<arr.length ;i++)
        {
            for( j=i; j < arr.length; j++ )
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp ;
                }
            }
        }
    }
    public static void print(int [] arr)
    {
        for(int i =0 ; i< arr.length ; i++)
        {
            System.out.printf("%d\n",arr[i]);
        }
    }
    public static String upperCase(String s ) 
    {   char [] st = s.toCharArray();
        boolean check = false ;
        int i ;
        st[0] = Character.toUpperCase(st[0]);
        for(i=0 ; i< st.length-1 ; i++)
        {
            if(Character.isWhitespace(st[i]))
            {
                st[i+1]= Character.toUpperCase(st[i+1]);
            }
        }
        return String.valueOf(st);
    }
    public static String firstLast(String str )
    {
        String [] st =  str.split(" ");
        return st[0] + st[st.length-1];
    }
    public static String middle(String str )
    {
        String [] st =  str.split(" ");
        String std =  "";
        for(int i =1 ; i< st.length-1;  i++)
        {
            std = std + st[i];
        }
        return std;
    }
    public static void main(String [] args)
    {   Scanner sc = new Scanner(System.in);
        int n ;
        //arraySorted(a);
        System.out.printf("this is the sorted\n");
        //print(a);
        String s  = sc.nextLine();
        String str = upperCase(s);
        System.out.printf(str);
        String a =firstLast(str);
        System.out.printf(a);
        String k =middle(str);
         System.out.printf("\n");
        System.out.printf(k);



        

        

    }
}