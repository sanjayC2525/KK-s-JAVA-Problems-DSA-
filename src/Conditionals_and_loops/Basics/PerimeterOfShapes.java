package Conditionals_and_loops.Basics;
import java.util.Scanner;
public class PerimeterOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1. Perimeter of Circle
        System.out.println("Enter the Radius:");
        double radius = input.nextDouble();
        if(radius <= 0){
            System.out.println("Invalid Input");
        }else {
            double res = 2 * Math.PI * radius;
            System.out.println(res);
        }
        // 2. Perimeter of Equilateral Triangle
        System.out.println("Enter the length of one side:");
        double len = input.nextDouble();
        if(len <= 0){
            System.out.println("Invalid Input!");
        }
        else{
            double res = 3 * len;
            System.out.println(res);
        }
        // 3. Perimeter of Parallelogram
        System.out.println("Enter the base & side Length");
        double base = input.nextDouble();
        double sLength = input.nextDouble();
        if(base <= 0 || sLength <= 0){
            System.out.println("Invalid Input");
        }
        else{
            double res = 2 * (base + sLength);
            System.out.println(res);
        }
        // 4. Perimeter of Rectangle
        System.out.println("Enter the Length & Breadth:");
        double length = input.nextDouble();
        double breadth = input.nextDouble();
        if(length <= 0 || breadth <= 0){
            System.out.println("Invalid Input");
        }else{
            double res = 2 * (length+breadth);
            System.out.println(res);
        }
        // 5. Perimeter of Square
        System.out.println("Enter the side:");
        double side = input.nextDouble();
        if(side <= 0){
            System.out.println("Invalid Input");
        }
        else{
            double res = 4 * side;
            System.out.println(res);
        }
        // 6. Perimeter of Rhombus
        System.out.println("Enter the Side:");
        double rSide = input.nextDouble();
        if(rSide <= 0){
            System.out.println("Invalid Input");
        }
        else{
            double res = 4 * rSide;
            System.out.println(res);
        }
    }
}
