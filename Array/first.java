package Array;

import java.util.Scanner;

public class first {
    //create the array using for loop and show on console using index
    // public static void main(String[] args) {
    //    int[] marks={10,20,85,65};
    //     for(int i=0 ; i< marks.length; i++)
    //    System.out.println(marks[i]);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] Number= new int[2];

        for(int i =0; i < Number.length;i++){
        System.out.println("Enter the number");
        Number[i] = sc.nextInt();
        }
         System.out.println("/nNumber");
         for(int i =0; i < Number.length;i++){
            System.out.println(Number[i]);
        }
        sc.close();
    }
    

}
