public class Lab4_Rectangle
{
    private float width ;
    private float lenght ;
   
    public float getWidth()
    {
        return this.width ; 
    }
    public float getLength()
    {
        return this.lenght; 
    }
    public float getArea()
    {
        return lenght*width ;
    }
    public float getPerimeter()
    {
        return  2*(lenght + width);
    }
    public void setWidth(float width  )
    {
        this.width = width; 
    }
    public void setLenght(float lenght )
    {
        this.lenght = lenght; 
    }
     public Lab4_Rectangle()
    {
        this.width = 0;
        this.lenght =0 ;
    }
    public Lab4_Rectangle(float width  ,  float lenght)
    {
        this.setWidth(width) ;
        this.setLenght(lenght);
    }   
    @Override
    public String toString()
    {
       return "Rectangle[" + width + ", " + lenght + "]";
    }


}