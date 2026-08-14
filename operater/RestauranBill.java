package operater;

public class RestauranBill {
    public static double calculateTotal(double subtotal) {
        
        double tax=subtotal*0.08;
        double tip=(subtotal+tax)*0.15;
        double total=subtotal+tax+tip;
        return total;
    }
    public static void main(String[] args) {
        double subtotal=100;
        double Bill=calculateTotal(subtotal);
        System.out.println(Bill);
    }
}
