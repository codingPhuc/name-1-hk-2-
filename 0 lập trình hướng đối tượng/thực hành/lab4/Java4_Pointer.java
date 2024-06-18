public class Java4_Pointer{ 
    private float x; 
    private float y ; 
    public float getY()
    {
        return this.y ;
    }
    public float getX()
    {
        return this.x ;
    }
    public void setX(float x)
    {
        this.x=x ;
    } 
    public void setY(float y)
    { 
         this.y =y ;
    } 
    public Java4_Pointer()
    {
       this.x =0 ;
       this.y=0;
    }
    public Java4_Pointer(float x, float  y)
    {
        this.setX(x);
        this.setY(y);
    }
}