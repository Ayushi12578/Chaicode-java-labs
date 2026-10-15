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

        /* 
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
    }*/

//multiply 2 number and return the product

public static int Calculate_Product(int mt_1,int mt_2){
    int product=mt_1*mt_2;
    return product;
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number : ");
    int Mt_1=sc.nextInt();
    System.out.print("Enter Number : ");
    int Mt_2=sc.nextInt();
   System.out.println("poduct ="+ Calculate_Product(Mt_1, Mt_2));
   sc.close();
}







    
}
