public class Shape 
{
    protected String color ;
    protected boolean filled ; 
    public Shape()
    {
        color = "red";
        filled = true ;
    }
    public Shape(String color , boolean filled)
    {
        setFilled(filled);
        setColor(color);
    }
    public void  setColor( String color)
    {
        this.color = color ;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled ;
    }
    public boolean isFilled()
    {
        return filled ;
    }
    public String getColor()
    {
        return color ;
    }
    @Override 
    public String toString()
    {
        return color + filled ;
    }

}