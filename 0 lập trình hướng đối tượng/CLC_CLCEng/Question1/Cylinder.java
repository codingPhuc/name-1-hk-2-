public class Circle {
    protected double radius ; 
    protected String color ; 
    public Circle(){ 
       this.color = "red";
       this.radius = 1.0 ;
    }
    public Circle(double radius)
    {
        setRadious(radius);
        color = "red";
    }
    public Circle(double radius, String color)
    {
        setColor(color);
        setRadious(radius);
    }
    public void setRadious(double radius)
    {
        this.radius =radius;
    }
    public void setColor(String color)
    {
         this.color =color ;
    }
    public double getArea()
    {
        return radius*radius* 3.14;
    }
    @Override 
    public String toString()
    {
        return radius + color ;
    }



}