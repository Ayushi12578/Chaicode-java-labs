package Userinput;

import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String Name=sc.nextLine().trim();
        System.out.println("Enter the age");
        int Age= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter course code:");
        String course=sc.nextLine();
        if(Name.isEmpty() || course.isEmpty()){
            System.out.println("Invalid registration");
        }
        else{
            System.out.println("Registration Succsefull");
            System.out.println("Name"+Name);
            System.out.println("Age"+Age);
            System.out.println("Course"+course);
        }
        sc.close();
    }
}
