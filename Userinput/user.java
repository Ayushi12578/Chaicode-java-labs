package Userinput;
import java.util.Scanner;
public class user {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter your name :");
        String Name = sc.nextLine();

        System.out.println("enter your age");
        int age =sc.nextInt();
        System.out.println("enter your hobby in cout");
        double Hobby= sc.nextDouble();
        System.out.println("====================================");
        System.out.println(Name);
        System.out.println(age);
        System.out.println(Hobby);
        sc.close();
    }
}
