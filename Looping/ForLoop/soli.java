package Looping.ForLoop;

import java.util.Scanner;

public class soli {
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
 
// pramid patter
/* 
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(i+" ");
        }
        System.out.println();
      }    */


     //palindromic patter     
     /*for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //1st half number
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        //2nd half number
        for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
     }*/

//Diaomond Pattern

//upper half code
        for(int i=1; i<=n;i++){
            //print space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print *
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }System.out.println();
        }
        //lower half
             for(int i=n; i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }System.out.println();
        }


                sc.close();
    }
}
