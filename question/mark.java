package question;

import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Eneter your umber");
        double mark=sc.nextDouble();
        if(mark >=90){
            System.out.println("A");
        }
        else if (mark >= 75) {
            System.out.println("B");
        }
        else if(mark >= 60){
            System.out.println("C");
        }
        else if(mark >= 40){
            System.out.println("D");
        }
        else{
            System.out.println("You are fail");
        }
     sc.close();   
    }

}
