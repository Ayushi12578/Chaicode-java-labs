package Userinput;
import java.util.Scanner;
public class SimpleCal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        double num1=sc.nextDouble();
        System.out.println("Enter opreater");
        char opreater= sc.next().charAt(0);
        System.out.println("Enter Second Number");
        double num2=sc.nextDouble();
        double result;
        switch (opreater) {
            case '+':
                result=num1+num2;
                break;
        
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            
            default:
                result=Double.NaN;
                break;
        }
        System.out.println("Result"+result);
        sc.close();

    }
}
