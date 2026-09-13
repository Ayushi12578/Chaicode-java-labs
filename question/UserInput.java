package question;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        double Number1 = sc.nextDouble();
        System.out.println("Enter the first number");
        double Number2 = sc.nextDouble();
        System.out.println("Enter the operater");
        char operater= sc.next().charAt(0);
        if(operater == '+'){
            System.out.println(Number1+Number2);
        }
        else if (operater == '-') {
            System.out.println(Number1-Number2);
        }
        else if (operater == '*') {
            System.out.println(Number1*Number2);
        }
        else if (operater == '/') {
            System.out.println(Number1/Number2);
        }
        else{
            System.out.println("Invalid operater");
        }
        sc.close();
    }
}
