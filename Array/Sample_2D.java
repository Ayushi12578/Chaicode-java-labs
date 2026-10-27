package Array;

import java.util.Scanner;

public class Sample_2D {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Row Size :");
    int rows=sc.nextInt();
    System.out.print("ENter coloum Size :");
    int cols=sc.nextInt();
    int num[][]=new int [rows][cols];
    // taking input
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            num[i][j]=sc.nextInt();

        }
    }
int x=sc.nextInt();
for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if (num[i][j]==x) {
                                System.out.print("x Found at loaction ("+i+","+j+")");

            }
            }
        }
        System.out.println();
        sc.close();
    }
    

 }   

