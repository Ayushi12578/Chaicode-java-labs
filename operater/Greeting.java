package operater;

public class Greeting {
    public static String greet(String name, int hour) {
        String mess="Good mornig ," +name +"!";
        return mess;
    }
   public static void main(String[] args) {
    String name="Avni";
    int hour=10;
    System.out.println(greet(name,hour));
    
   }
}
