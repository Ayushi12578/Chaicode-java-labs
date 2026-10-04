package Looping.ForLoop;

import java.util.Scanner;

public class java_lect6pattern {
    public static void main(String[] args) {
        //butterfly
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        //  upper half pattern

        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for ptintng space
            for(int k=1; k<=2*(n-i);k++){
                System.out.print(" ");
            }
            
            // side upper part

            for(int j=1;j<=i;j++){
                // for(int k=1;k<=j;k++){
                //     System.out.print("*");
                // }
            System.out.print("*");
            }
          
           
            System.out.println();
        }
         for(int i =n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for ptintng space
            for(int k=1; k<=2*(n-i);k++){
                System.out.print(" ");
            }
            
            // side upper part

            for(int j=1;j<=i;j++){
                // for(int k=1;k<=j;k++){
                //     System.out.print("*");
                // }
            System.out.print("*");
            }
          
           
            System.out.println();
        }
      
       
        sc.close();
    }
    
}
