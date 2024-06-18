public class Lab5_Club{
    private String name ; 
    private int win ;
    private int draw ;
    private int loss ;
    public Lab5_Club()
    {
        this.name = "";
        this.win = 0 ;
        this.loss  = 0 ;
        this.draw =0 ;
    }
    public Lab5_Club(String name , int win , int draw , int loss)
    {
        this.setName(name);
        this.setWin(win);
        this.setLoss(loss);
        this.setDraw(draw);
    }
      public Lab5_Club(Lab5_Club club)
    {
        this.name = club.name;
        this.win = club.win ;
        this.loss = club.loss;
        this.draw= club.draw;
    }
    public String getName()
    {
        return this.name ;
    }
     public int getWin()
    {
        return this.win ;
    }
     public int getDraw()
    {
        return this.draw ;
    }
     public int  getLoss()
    {
        return this.loss;
    }
    public void setName(String name)
    { 
        this.name =name;
    }
     public void setWin(int win )
    { 
        this.win=win;
    }
     public void setLoss(int loss)
    { 
        this.loss=loss;
    }
     public void setDraw(int draw)
    { 
        this.draw =draw;
    }
    public int numMatchesPlayed()
    {
        return draw + win + loss ;
    }
    public boolean isFinish()
    {
        return numMatchesPlayed()>10;
    }
    public int getPoint()
    {
        return win*3 + draw*1 + loss*0;
    }
    @Override 
    public String toString()
    {
        return "Club"+ name+":" +win+"/"+draw+"/"+loss+"" ;
    }

}