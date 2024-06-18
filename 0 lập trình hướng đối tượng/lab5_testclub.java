public class  lab5_testclub{
    public static void main(String[] args){

       Lab5_Club club = new Lab5_Club("the dumass", 3,5,2);
        System.out.println(club);
        System.out.println(club.isFinish());
        System.out.printf("%d\n",club.numMatchesPlayed());
        System.out.printf("%d\n",club.getPoint());
        System.out.printf("%d\n",club.getDraw());
        Lab5_RegularPolygon shape =  new  Lab5_RegularPolygon(" phuc nguyen ", 5,6);
        System.out.println(shape);
    }
}