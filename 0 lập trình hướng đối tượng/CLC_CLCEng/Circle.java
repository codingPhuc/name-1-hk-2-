public class Circle implements GeometricObject 
{
    protected  double radius ;
    public Circle () {
        this.radius=1.0 ;
    }
    public Circle (double radius) {
        this.radius=radius ;
    }
    @Override 
    public String toString()
    {
        return "radius = "+ this.radius ;
    }
    public  double getPerimeter() {
        return Math.PI *2.0*this.radius;
    }
    public  double getArea() {
        return Math.PI *this.radius*this.radius;
    }
}