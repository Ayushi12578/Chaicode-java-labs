package Array;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //linear search 
        Scanner sc= new  Scanner(System.in);
        System.out.print("Enter Array");
        int number= sc.nextInt();
        int n[]=new int[number];
        for(int i=0;i<number;i++){
            n[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<n.length;i++){
            if(n[i]==x){
                System.out.println("x Found at index"+i);
            }
        }
        sc.close();
    }
}
