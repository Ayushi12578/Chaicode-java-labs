package methods;

import java.util.Scanner;

public class Even_odd {
    public static void Even(int n){
        if(n%2==0){
            System.out.println("number is even");
            return;
        }
        else{
            System.out.println("number is odd");
        }
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        Even(num);
        sc.close();
    }
}
