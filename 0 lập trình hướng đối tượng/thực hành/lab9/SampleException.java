public class SampleException {
    public static double factorial(int n) throws MathException {
    if (n < 0) {
        throw new MathException("yolo bany ");
    } 
    else {
    double output = 1;
    for (int i = 2; i <= n; i++)
    {
        output *= i;
    }
        return output;
        }
    }
    public static void main(String[] args) throws MathException {
    System.out.println("n = 5 --> " + factorial(5));
        try {System.out.println("n = 6 --> " + factorial(6));
        
            System.out.println("n = -1 --> " + factorial(-1));
        }      
         catch (MathException err) {
            System.out.println(err);
        }
    
        System.out.println("n = 6 --> " + factorial(6));
    }
}