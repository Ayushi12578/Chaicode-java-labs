package Condition;

public class TrafficLight {
     public static void main(String[] args) {
         int choice=1;
        
        switch (choice) {
            case 1:
               System.out.println("Red means Stop");
                break;
                case 2:
                System.out.println("Yellow Means Ready ");
                case 3:
                      System.out.println("Green means Go");
            default:
                System.out.println("Invalid Signal");
        }

    } 
}
