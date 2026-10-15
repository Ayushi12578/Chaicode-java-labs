package methods;

import java.util.Scanner;

public class avg {
    public static void Avg_of_Three(int n,int m,int p){
    int sum= (n+m+p);
    System.out.println(sum);
    int div=sum/3;
    System.out.println(div);
    return ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num=sc.nextInt();
        System.out.print("Enter second number");
        int num_2=sc.nextInt();
        System.out.print("Enter third Number :");
        int num_3=sc.nextInt();
        System.out.print("Addition of three number is :");
        Avg_of_Three(num, num_2, num_3);
        
        sc.close();
    }
}
