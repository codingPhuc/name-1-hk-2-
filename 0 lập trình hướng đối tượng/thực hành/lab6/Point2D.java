public class Point2D 
{ 
    protected float X ;
    protected float Y ; 
    public Point2D ()
    {
        this.X = 0 ;
        this.Y= 0 ;

    }
    public Point2D(float X , float Y)
    {
        setX(Y);
        setY(X);
        setXY(X,Y);
    }
    public  void setX(float X)
    {
        this.X = X ;
    }
     public  void setY(float Y)
    {
        this.Y = Y;
    }
    public void setXY (float X , float Y )
    {
        this.X = X ;
        this.Y = Y;
    }
    public float getX()
    {
        return this.X ;
    }
    public float getY()
    {
        return this.Y;
    }
    public  float[] getXY()
    {   float[] A = {X,Y};
        return A ; 
    }
    @Override 
    public String toString()
    {
        return  X +" "+  Y ;
    }

}