package FunctionsBasic;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle :");
        double radius = input.nextDouble();
        double circumference = circumference(radius);

        System.out.printf("The Circumference of Circle is : %.2f",circumference);
        input.close();
    }

    static double circumference(double radius){
        return Math.PI * (radius * radius);
    }
}
