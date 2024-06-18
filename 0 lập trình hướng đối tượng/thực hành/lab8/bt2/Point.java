public class Point{
    public  double X; 
    public double Y ;
    public Point( double X , double Y)
    {
        this.setX(X);
        this.setY(Y);
    }
    public void setY(double  Y)
    {
        this.Y = Y ;
    }
    public void setX(double X)
    {
        this.X = X ;
    }
    public double getY()
    {
        return Y; 
    }
    public double getX()
    {
        return X; 
    }
    
    @Override 
    public String toString()
    {
        return "X = "+ X+ " Y = "+Y;
    }


}