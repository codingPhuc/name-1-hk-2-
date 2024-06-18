public abstract class Shape{
    protected String color;
    protected boolean filed;
    public Shape()
    {
        this.color = "";
        this.filed = true ;
    }
    public Shape(String color, boolean filed)
    {
        setColor(color);
        setFilled(filed);
    }
    public String getColor()
    {
        return color;
    }
    public boolean isFilled()
    {
        return filed;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setFilled(boolean filed)
    {
        this.filed = filed;
    }
    abstract boolean equals(Shape s);
    abstract double getArea();
    abstract double getPerimeter();
    @Override 
    public String toString()
    {
        return "Rectangle{" + "color=" + this.color+ ", filled=" + this.filed + '}' ;
    }
}