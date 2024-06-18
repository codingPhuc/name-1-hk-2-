public class Faction_Lab4
{
    private int num ;
    private int denom ;
    public Faction_Lab4 ()
    {
        num=0 ;
        denom =0 ;
    }
    public Faction_Lab4(int num, int denom)
    {
        this.num = num;
        this.denom=denom;
    }
    public Faction_Lab4(Faction_Lab4 other)
    {
        this.num =other.num;
        this.denom = other.denom;

    }
    public Faction_Lab4 add(Faction_Lab4 other)
    {
        Faction_Lab4  result = new Faction_Lab4(num*other.denom + other.num * denom , denom* other.denom);
        result.reducer() ;
        return result ; 
    }
    public Faction_Lab4 div(Faction_Lab4 other)
    { 
        Faction_Lab4 result = new Faction_Lab4(num*other.denom ,denom*other.num);
        result.reducer() ;
        return result ; 
    }
    public Faction_Lab4 mul( Faction_Lab4 other )
    {
        Faction_Lab4 result = new Faction_Lab4(num*other.num , denom*other.denom);
        result.reducer() ;
        return result ;
    }
    public Faction_Lab4 sub(Faction_Lab4 other)
    {
        Faction_Lab4 result = new Faction_Lab4(num*other.denom - other.num +denom , denom *other.denom);
        result.reducer() ;
        return  result ;
    }
    private void reducer()
    {
        int i = Math.min(Math.abs(num),Math.abs(denom));
        if(i==0)
            return ;
        while((num%i!= 0) || (denom%i != 0) )
        {
            i-- ; 
        }
        num = num/i ;
        denom= denom /i;

    }
    @Override 
    public String toString()
    {
        return "faction : " +num+  "/"+ denom + "";
    }


    

}