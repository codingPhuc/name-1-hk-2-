/* java ex 5/3/2022 */ 
public class ExceptionHandling {
    public static void main(String [] agrs)
    {   try{/*this is causing an exception */
            int myInt = Integer.parseInt("pants");
            }   
        catch (Exception a ) {/* catch the ex can have multiple ex */ 
            System.out.println("this is not the thing i want");

        }
        finally 
        {/*this always ex so the final vaule will be decided by the finnaly block */
            System.out.println("this is the thing with you is this the thing you want the most in this word ");
        }
        System.out.println("end here");
    }
}