public class TestString{
    public static void main(String [] args)
    {      String text = new String("Im studying 501043");
        System.out.println("text: "+ text);
        System.out.println("text.length() "+ text.length());
        System.out.println("text: "+ text.charAt(5));
        System.out.println("text: "+ text.substring(5,8));
        System.out.println("text: "+ text.indexOf("in")); 
        String newText= text +" how about you";
        newText = newText.toUpperCase();
        if(text.equals(newText))
            System.out.println("this is good ");
        else 
            System.out.println("this is bad");
    }
}