import java.util.*;

public class bai5lab1 {

  public static boolean check(int year) {

    boolean leap = false;

    
    if (year % 4 == 0) {

      if (year % 100 == 0) {

        
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      
      else
        leap = true;
    }
    
    else
      leap = false;

    return leap;
  }
  public static void  main  (String[] args)
  {
    Scanner sc =  new Scanner ( System.in);
    int year;
    boolean leap;
    year= sc.nextInt();
    leap = check(year);
    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}
