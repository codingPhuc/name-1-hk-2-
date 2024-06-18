import java.lang.Math ;
import java.util.ArrayList;
public class FindPointer {
   
    
    public static void  display(ArrayList pointer) 
    {   ArrayList<Point> po = new ArrayList<Point>(pointer);
        for(int i =0; i< po.size() ; i++)
        {       

            System.out.println(Math.sqrt((Math.pow(po.get(i).X,2))+ Math.pow(po.get(i).Y,2) ));
        }
    }
    public static void main(String [] args)
    {   ArrayList<Point> pointer = new ArrayList<Point>();
        pointer.add(new Point(4,5));
        pointer.add(new Point(5,6));
        display(pointer);
        System.out.println(pointer.get(1).X) ;
    }
}