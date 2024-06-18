public class ResizableCircle extends Circle implements Resizable 
{
    public ResizableCircle ()
    {
        super();
    }
    public ResizableCircle(double radius)
    {
        super(radius);
    }
    @Override
    public  String toString() {
        return "resive circle ="+super.radius;
    }
    public void resize(double percent)
    {
        super.radius*=percent/100 ;
    }
    
}