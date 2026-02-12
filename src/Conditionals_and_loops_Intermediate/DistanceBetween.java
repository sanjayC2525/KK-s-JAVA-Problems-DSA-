package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class DistanceBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x1 & y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter the value of x2 & y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double dx = x2-x1;
        double dy = y2-y1;
        double distance = Math.sqrt(dx*dx+dy*dy);
        System.out.printf("The distance between two point is %.2f",distance);
        input.close();
    }
}
/* Yet another way to calculate distance
*  double distance = Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2))*/