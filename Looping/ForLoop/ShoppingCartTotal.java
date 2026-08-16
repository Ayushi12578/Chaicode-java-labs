package Looping.ForLoop;

public class ShoppingCartTotal {
    public static void main(String[] args) {
        
    double[] prices={10.5,20.5,80.5,170.5};
    double total=0.0;
    for (int i=0; i < prices.length;i++){
        if(prices[i]>=0){
            total=total+prices[i];
        }
    }
    System.out.println("Total Amount :" +total);
}
}
