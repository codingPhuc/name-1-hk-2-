public class lab4_House{
    private String  houseCode ;
    private  int numOfBedRooms ;
    private boolean  hasSwimmingPool ;
    private double area ;
    private double costPerSquareMeter ;
    public lab4_House(){ 
        this.houseCode="A01";
        this.numOfBedRooms =2 ;
        this.area = 0 ;
        this.costPerSquareMeter=0; 
        this.hasSwimmingPool = false ; 
    }
    public lab4_House(String houseCode , int numOfBedRooms , boolean hasSwimmingPool , double area , double costPerSquareMeter)
    {
        setHouseCode(houseCode);
        setNumOfBedRooms(numOfBedRooms);
        setHasSwimmingPoo(hasSwimmingPool);
        setArea(area);
        setCostPerSquarMeter(costPerSquareMeter);
    }
    public String getHouseCode()
    {
        return this.houseCode ;
    }
     public int getNumOfBedRooms()
    {
        return this.numOfBedRooms ;
    }
     public boolean getHasSwimmingPool()
    {
        return this.hasSwimmingPool;
    }
     public double getArea()
    {
        return this.area ;
    }
     public double  getCostPerSquarMeter()
    {
        return this.costPerSquareMeter;
    }
    public void setHouseCode(String houseCode)
    {
        this.houseCode= houseCode ;
    }
     public void setNumOfBedRooms(int numOfBedRooms)
    {
        this.numOfBedRooms=  numOfBedRooms ;
    }
     public void setHasSwimmingPoo(boolean hasSwimmingPool)
    {
        this.hasSwimmingPool= hasSwimmingPool ;
    }
     public void setArea(double area)
    {
        this.area= area ;
    }
     public void setCostPerSquarMeter(double costPerSquareMeter)
    {
        this.costPerSquareMeter= costPerSquareMeter ;
    }

    public double calculateSellingPrice()
    {
        double Subtotal = area *costPerSquareMeter;
        if(hasSwimmingPool)
        {
            Subtotal =  Subtotal + Subtotal*0.1;
        }
        return  Subtotal + Subtotal *0.15;
    }
    @Override 
    public String toString()
    {
        return "House["+houseCode+"," +numOfBedRooms+"," +hasSwimmingPool+","+ calculateSellingPrice()+"]";
    }


}