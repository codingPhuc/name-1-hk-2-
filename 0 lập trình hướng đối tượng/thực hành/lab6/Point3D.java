public class Point3D extends Point2D 
{
    private float Z ;
    public Point3D ()
    {
        super();
        this.Z =0 ;
    }
    public Point3D (float X , float Y , float Z )
    {
        super(X , Y);
        setZ(Z);
        
    }
    public float  getZ ( )
    {
        return Z  ;
    }
    public void setZ(float Z)
    {
        this.Z = Z ;
    }
    public float[] getXYZ()
    {
        float[] A = {X,Y,Z};
        return A;
    }
    public void  setXYZ(float X,float Y , float Z)
    {
        setXY(X,Y);
        setZ(Z);
    }
    @Override 
    public String toString()
    {   
        return X +" "+ Y + " "+ Z;
    }




}