package methods;

import java.util.Scanner;

public class table {
 public static void my_table(int n){
    for(int i=1;i<=10;i++){
    //   i=i*n; this logic is also correct but need the print
        //System.out.println(i*n);//this is also correct
        System.out.println( n + "*" +i+"="+ i*n);
    }   
    return ;
    
 }   
 public static void main(String[] args) {
    Scanner mc= new Scanner(System.in);
    System.out.println("enter number :");
    int n=mc.nextInt();
    my_table(n);
    mc.close();
 }
}
