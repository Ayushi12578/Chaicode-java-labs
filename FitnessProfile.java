package Varibale;
import java.util.Scanner;
public class FitnessProfile{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your height");
    double heightcM=input.nextDouble();
    double heightm= heightcM/100;
    System.out.println("ENter your weight");
    double Weight=input.nextDouble();
    
    double BMI= Weight/(heightm*heightm);
    System.out.println(BMI);
    input.close();
}
}
