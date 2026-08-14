package operater;

public class SalesDiscount {
     public static double applyDiscount(double originalPrice, int discountPercent) {
       double SalesP = originalPrice * (1  - discountPercent / 100.0);
       
      return SalesP;

       }
      public static void main(String[] args) {
        double originalPrice=100.0;
        int discountPercent=20;
        double result= applyDiscount(originalPrice, discountPercent);
        System.out.println(result);
      }
    }
    

