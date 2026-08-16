package Looping.WhileLoop;

public class ReverseNumber {
 public static void main(String[] args) {
    int n=10;
    if(n < 0){
        System.out.println("Given number is Negative");
    }
    else{
        while (n>=0) {
            System.out.println(n);
            n--;
        }
    }
 }   
}
