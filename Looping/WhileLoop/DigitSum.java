package Looping.WhileLoop;

public class DigitSum {
    public static void main(String[] args) {
        
         int Number=125;
    if(Number < 0){
        System.out.println("Number is Negative");
    }
    else{
       int Sum=0;
       while(Number>0){
        int n= Number%10;
        Sum=Sum+n;
        Number=Number/10;
       }
       System.out.println("Digit Sum ="+Sum);
    }
    }
}
