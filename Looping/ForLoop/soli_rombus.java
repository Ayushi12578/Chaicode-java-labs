package Looping.ForLoop;

import java.util.Scanner;

public class soli_rombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*for(int i=1;i<=n;i++){
            // print the spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print starts
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
                }*/
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(i+" ");
        }
        System.out.println();
      }         


                sc.close();
    }
}
