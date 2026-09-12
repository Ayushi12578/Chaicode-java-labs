package methods;

import java.util.Scanner;

public class GeometryAreas {
      public static double circleArea(double radius) {
         double area= Math.PI*radius*radius;
        return area;
    }
public static double rectangleArea(double width, double height)   {
         
     double recatangle = width*height;
     return recatangle;
}
     public static double triangleArea(double base,double height){
        double triangle =0.5*base*height;
        return triangle;
     }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the data");
        double data=sc.nextDouble();
        System.out.println("Enter the second data");
       double numeric=sc.nextDouble();
      double result= triangleArea(data, numeric);
      System.out.println("Triangle area ="+result);
      double total= rectangleArea(numeric, data);
      System.out.println("Rectangle area ="+total);
      double sum= circleArea(data);
      System.out.println("Area of circle ="+sum);
      sc.close();
     }
}  

  
