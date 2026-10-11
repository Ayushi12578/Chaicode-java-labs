package methods;

import java.util.Scanner;

public class prime {
    public static void Print_prime(int n){
        for(int i=2;i<n;i++){
             if (n%i==0) {
            System.out.println("number is not prime");
            return ;
        }
        else{
            System.out.println("number is prime");
        }
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number=sc.nextInt();
        Print_prime(number);
        sc.close();
    }
}
