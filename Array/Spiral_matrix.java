package Array;

import java.util.Scanner;

public class Spiral_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows");
        int n=sc.nextInt();
        System.out.print("Enter colums");
        int m=sc.nextInt();
        int [][]matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("the spiral order matrix ix :");
        int rowstart=0;
        int rowend=n-1;
        int colstart=0;
        int colend=m-1;
        // print spiral
        while (rowstart <= rowend && colstart <=colend) {
            for(int col=colstart; col<=colend;col++){
                System.out.print(matrix[rowstart][col] + " ");
            }
            rowstart++;
            for(int row=rowstart;row <=rowend; row++){
                System.out.print(matrix[row][colend]+ " ");
            }
            colend--;
            for(int col=colend; col>=colstart; col--){
                System.out.print(matrix[rowend][col]+" ");
            }
            rowend--;
            for(int row=rowend; row>=rowstart; row--){
                System.out.print(matrix[row][colstart]);
            }
            colstart++;
            System.out.println();
        }
        sc.close();
    }
}
