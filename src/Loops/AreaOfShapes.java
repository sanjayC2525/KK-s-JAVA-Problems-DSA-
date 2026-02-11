package Loops;
import java.util.Scanner;
public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           /* // 1. Radius of a Circle
            System.out.println("Enter the radius of Circle:");
            double r = input.nextDouble();
            if (r <= 0) {
                System.out.println("Invalid input");
            } else {
                double res = Math.PI * r * r;
                System.out.println(res);
            }
            // 2. Area of Triangle (general)
            System.out.println("Enter the Height & Base:");
            double h = input.nextDouble();
            double b = input.nextDouble();
            if (h <= 0 || b <= 0) {
                System.out.println("Invalid Input Try Again!");
            } else {
                double res = 0.5 * h * b;
                System.out.println(res);
            }
            // 3. Area of Rectangle
            System.out.println("Enter the Length & Width:");
            double l = input.nextDouble();
            double w = input.nextDouble();
            if (l <= 0 || w <= 0) {
                System.out.println("Invalid Input!");
            } else {
                double res = l * w;
                System.out.println(res);
            }
            // 4. Area of Isosceles Triangle
            System.out.println("Enter the length & base:");
            double len = input.nextDouble();
            double base = input.nextDouble();
            if (len <= 0 || base <= 0) {
                System.out.println("Invalid Input!!");
            } else {
                double a = 4 * (len * len) - (base * base);
                if (a < 0) {
                    System.out.println("Negative Expression Found");
                } else {
                    double res = 0.25 * base * Math.sqrt(4 * (len * len) - (base * base));
                    System.out.println(res);
                }
            }
            // 5. Area of Parallelogram
            System.out.println("Enter the length of the base & perpendicular height (distance between the parallel sides)");
            double lBase = input.nextDouble();
            double pHeight = input.nextDouble();
            if (lBase <= 0 || pHeight <= 0) {
                System.out.println("Invalid Input!");
            } else {
                double res = lBase * pHeight;
                System.out.println(res);
            }
            // 6. Area of Rhombus
            System.out.println("Enter the d1 & d2:");
            double d1 = input.nextDouble();
            double d2 = input.nextDouble();

            if (d1 <= 0 || d2 <= 0) {
                System.out.println("Invalid input!");
            } else {
                double res = 0.5 * d1 * d2;
                System.out.println(res);
            }
            // 7. Area of Equilateral Triangle
            System.out.println("Enter the side:");
            double side = input.nextDouble();
            if (side <= 0) {
                System.out.println("Invalid Input");
            } else {
                double res = (Math.sqrt(3) / 4) * (side * side);
                System.out.println(res);
            } */
            // 8. Curved Surface Area of Cylinder
        System.out.println("Enter the Radius & height for Curved Surface Area of Cylinder:");
        double radius = input.nextDouble();
        double height = input.nextDouble();
        if(radius <= 0 || height <= 0){
            System.out.println("Invalid Input");
        }else{
            double res = 2 * Math.PI *radius*height;
            System.out.println(res);
        }
            // 9. Total Surface Area of Cube
        System.out.println("Enter the side for Total Surface Area of Cube");
        double side1 = input.nextDouble();
        if(side1 <= 0){
            System.out.println("Invalid Input");
        }else{
            double res = 6*(side1*side1);
            System.out.println(res);
        }
    }
}
