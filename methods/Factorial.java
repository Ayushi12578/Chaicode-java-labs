package methods;

import java.util.Scanner;

public class Factorial {
    public static void print_factorial(int fact){
        if (fact<=0) {
            System.out.println("invalid number");
            return ;
        }
        int factorial=1;
        for(int i=fact;i>=1;i--){
            factorial=factorial*i;
        }
    System.out.println(factorial);
    return;   
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int fact=sc.nextInt(); 
    print_factorial(fact);
    sc.close();
  }
}
