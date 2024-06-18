import java.io.FileReader ;
public class PubliclassCheck {
    public static void main(String []args) throws FileNotFoundException
    {
        readFile("myFile.txt");
    }
    private static void readFile(String fileName) throws FileNotFoundException /* this is a check ex you must deal with it */ 
    {
       
        FileReader reader = new FileReader(fileName);
    
      
    }
}