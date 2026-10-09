package Looping.ForLoop;

import java.util.Scanner;

public class Hollow_Butterfly {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        //upper left 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //print hollow butterfly
               if (j == 1 || j == i) {
        System.out.print("* ");
}
         else {
            System.out.print(" ");
        }
            }
            //pint spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //print upper rigth
            for(int k=1;k<=n;k++){
                if (k==1||k==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if (j==1||j==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                if (k==1||k==i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
