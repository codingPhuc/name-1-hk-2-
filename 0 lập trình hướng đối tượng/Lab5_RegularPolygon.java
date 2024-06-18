public class Lab5_RegularPolygon{
    private String name ; 
    private int egedAmount;
    private double egedLenght ;
    public Lab5_RegularPolygon()
    {
        this.name = "";
        this.egedAmount = 3;
        this.egedLenght  = 1 ;
    }
    public Lab5_RegularPolygon(String name , int egedAmount , double egedLenght )
    {
        this.setName(name);
        this.setLength(egedLenght);
        this.setAmount(egedAmount);
    
    }
    public Lab5_RegularPolygon(String name ,  int egedAmount )
    {
        this.setName(name);
        this.length= 1;
        this.setAmount(egedAmount);
    
    }
    public Lab5_RegularPolygon(Lab5_RegularPolygon club)
    {
        this.name = club.name;
        this.egedAmount = club.egedAmount;
        this.egedLenght = club.egedLenght;
    }
    public String getName()
    {
        return this.name ;
    }
     public double getLength()
    {
        return this.egedLenght;
    }
     public int getAmount()
    {
        return this.egedAmount;
    }
    public void setName(String name)
    { 
        this.name =name;
    }
     public void setLength(double egedLenght)
    { 
        this.egedLenght=egedLenght;
    }
     public void setAmount(int loss)
    { 
        this.egedAmount=egedAmount;
    }
    public String getPolygon()
    {
        if(egedAmount>6)
            return "Polygon has the number of edges greater than 6";
        if(egedAmount==6)
            return "Quadrangle";
        if(egedAmount==5)
            return "Pentagon";
        if(egedAmount==4)
            return "Quadrangle";
        if(egedAmount==3)
            return "Triangle";
        return "";
    }
    public double getPerimeter()
    {
        return egedLenght* egedAmount;
    }
    public double getArea()
    {   
        double area=1 ;
        if(egedAmount>6) 
            return -1 ;
        if(egedAmount==5)
            area= egedLenght*egedLenght *1.72;
        if(egedAmount==4)
            area= egedLenght*egedLenght *1;
        if(egedAmount==3)
            area= egedLenght*egedLenght *0.433;
        if(egedAmount==6)
            area= egedLenght*egedLenght *2.593;
        return area;
    }




}