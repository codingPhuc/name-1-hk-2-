public class Circle extends Shape {
    protected double radius ; 
    protected String color ; 
    public Circle(){ 
       super();
       this.radius = 1.0 ;
    }
    public Circle(double radius)
    {   super() ;
        setRadious(radius);
    }
    public Circle(double radius, String color , boolean filed)
    {
        super(color ,filed);
        setRadious(radius);
    }
    public void setRadious(double radius)
    {
        this.radius =radius;
    }
    public double getRadious()
    {
        return this.radius ;
    }
    double getArea()
    {
        return radius*radius* 3.14;
    }
    double getPerimeter()
    {
        return 2*3.14*radius ;
    }
    boolean equals(Shape s)
    {
        if(s instanceof Circle) {
            Circle temp = (Circle) s;
            if(this.getArea() == temp.getArea()) {
                return true;
            }
            }
            return false;
            
           
    }
    @Override 
    public String toString()
    {
        return radius + color ;
    }



}