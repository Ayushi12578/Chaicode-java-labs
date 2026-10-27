package Array;

import java.util.Scanner;

public class Two_D_Array {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows Size");
    int rows=sc.nextInt();
    System.out.println("Enter column size");
    int cols=sc.nextInt();
    int [][] number=new int[rows][cols];
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            number[i][j]=sc.nextInt();
        
        }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(number[i][j] +" ");
        }
        System.out.println();
    }
    sc.close();
 }   
}
