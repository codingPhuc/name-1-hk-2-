public class Rectangle extends Shape
{
    protected double width ; 
    protected double lenght ;
    public Rectangle()
    {   super();
        this.width= width ;
        this.lenght = lenght ;
    }
     public Rectangle(double width , double lenght)
    {   super();
        
    }
     public Rectangle(double width , double lenght, String color , boolean filled )
    {   super(color , filled);
        this.width= width ;
        this.lenght = lenght ;
    }
    public double getWidth()
    {
        return width ;
    }
    public  double getLenght()
    {
        return lenght;
    }
    public void setWidth()
    {
        this.width = width ;
    }
    public void setLength()
    {
        this.lenght = lenght ;
    }
    public double getPerimeter()
    {
        return (width + lenght)*2 ;
    }
    @Override 
    public String toString()
    {
        return width +" " +lenght ;
    }


}