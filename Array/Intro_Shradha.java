package Array;

import java.util.Scanner;

public class Intro_Shradha {
    public static void main(String[] args) {
        /* 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();*/
//Array size declare by user
    /*  
    int number[]=new int[n];
       for(int i=0;i<n;i++){
        System.out.println(number[i]);
       }*/ 
// declare by maker
        // int marks[]={95,56,100};
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }

 // for output
 
        Scanner sc= new Scanner(System.in);
        int numbe = sc.nextInt();
        int n[]= new int[numbe];

        //for input
        for(int i=0;i<numbe;i++){
            n[i]=sc.nextInt();

        }
        for(int i=0;i<numbe;i++){
            System.out.print(n[i]);

        }
        sc.close();
    }
}             
