package question;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = mc.nextInt();
        if(number%2==  0){
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        mc.close();
    }
}
