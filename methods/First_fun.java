package methods;

import java.util.Scanner;

public class First_fun {
   /*  public static void My_Name (String name){
        System.out.println(name);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
       My_Name("My name is "+name);
        sc.close();
    }*/

    public static int Calculater(int sum1,int sum2){
        System.out.println(sum1+sum2);
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num_1=sc.nextInt();
        System.out.println("Enter number ");
        int num_2=sc.nextInt();
        System.out.println("Addition is");
        Calculater(num_1, num_2);
        sc.close();
    }
    
}
