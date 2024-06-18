public class Main{
    public  static void main(String[] args) 
    {
        Java4_Pointer x = new Java4_Pointer(4,5);

        System.out.printf("%f\n",x.getX());
        System.out.printf("%f\n",x.getY());
        Lab4_Rectangle y= new Lab4_Rectangle(5,4);
        System.out.printf("%f\n",y.getWidth());
        System.out.printf("%f\n",y.getArea());
        System.out.printf("%f\n",y.getPerimeter());
        System.out.println(y); 
        Lab4_Student z = new Lab4_Student(56 , "this is phuc", " last name");
        System.out.println(z);
        lab4_House house = new lab4_House("f033" , 2 , true , 100, 2500000);
        System.out.println(house);
        System.out.printf("%f\n",house.calculateSellingPrice());
        Faction_Lab4  a  = new Faction_Lab4(4,3);
        Faction_Lab4  b = new Faction_Lab4(8,7) ;
        Faction_Lab4 c = a.add(b);
        System.out.println(c);
    }
}