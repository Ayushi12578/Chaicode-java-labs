package operater;
public class gemotryarea {

         public static double circleArea(double radius) {
            double area= Math.PI*radius*radius;
        return area;
    }

    public static double rectangleArea(double width, double height) {
        double recatangle=height*width;
        return recatangle;
    }

    public static double triangleArea(double base, double height) {
        double triangle=0.5*base*height;
        return triangle;
    }
    public static void main(String[] args) {
        double circle= circleArea(0.5);
        double rec= rectangleArea(10, 20);
        double tri= triangleArea(10.0,10);

        System.out.println(circle);
        System.out.println(rec);
        System.out.println(tri);
    }
    }
