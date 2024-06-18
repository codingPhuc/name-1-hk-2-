public class Cylinder extends Circle 
{
    private  double height ;
    public  Cylinder () 
    {
        super();
        height = 1.0 ;

    }
    public Cylinder(double radius)
    {
        super(radius);
        height = 1.0 ;
    }
    public Cylinder(double radius,double height)
    {
        super(radius);
        setHeight(height);
    
    }
    public Cylinder(double radius, double height , String color  )
    {
        super(radius,color);
        setHeight(height);
        
    }
    public double getHeight()
    { 
        return height ;
    }
    public void setHeight(double height)
    {
        this.height = height ;
    }
    public double getVolum()
    {
        return radius*3.14*2*height ;
    }
    @Override 
    public String toString()
    {
        return height +" "+ radius +" "+ color ;
    }



}

