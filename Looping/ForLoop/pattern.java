package Looping.ForLoop;

import java.util.Scanner;

public class pattern {
     public static void main(String[] args) {
        //full rectangle pattern print
      /*   for(int i =1; i<=4;i++){
            for(int j =1;j<=5;j++){
                System.out.print("*");
               
            }
             System.out.println("*");
        }*/


    //    hollow rectangle
    /*
        for(int i = 1; i<=5;i++){
            for(int j=1;j<=7;j++){
                if( i==1 || j==1|| i==5||j==7){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        } */

        

            //half pyramid problem
  /*  Scanner sc= new  Scanner(System.in);
    System.out.print("Enter the number");
    int n=sc.nextInt();
    for(int i =1; i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        System.out.println();
    } */


//reverse the patter
/*
 Scanner sc= new  Scanner(System.in);
    System.out.print("Enter the number");
    int n=sc.nextInt();
    for(int i =n; i>=1;i--){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
     */

    //inverted half pyramid (rotated 180 degree)
/* 
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter Number :");
    int n=sc.nextInt();
    for(int i =1; i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print( " ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
                System.out.println();

    }*/


// half pyramin with number
/* 
Scanner sc= new  Scanner(System.in);
System.out.print("ENter the number:");
int n = sc.nextInt();
for(int i =1; i<=n;i++){
    for(int j =1; j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}
 */


// reverse half 180 degree pyramid 
/* 

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i =n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println(" ");
}
sc.close();
*/


//floyd's Triangle
/*
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int m=1;
for(int i =1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(m+" ");
        m++;
    }
    System.out.println();
} */

//print 0 1 Triangle
/* 
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        int add=i+j;
        if(add % 2 ==0){
            System.out.print("1"+ " ");
        }
        else{
            System.out.print("0"+ " ");
        }
    }
    System.out.println();
}*/
// Print a solid rhombus.
/*
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=n;k++){
        System.out.print("*");
    }
    System.out.println();
} */
//Print a number pyramid.
 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print( " ");
    }
    for(int k=1;k<=i;k++){
        System.out.print(i+" ");
    }
    System.out.println();
}
   sc.close();


     }
}
