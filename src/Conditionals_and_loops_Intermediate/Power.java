package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Base:");
        double base = in.nextDouble();
        System.out.println("Enter the Exponent:");
        int exponent = in.nextInt();
        if(base == 0 && exponent <= 0){
            System.out.println("Invalid input: 0 to a non-positive power is undefined.");
            return;
        }
        double power = Math.pow(base,exponent);
        System.out.printf("Power : %.2f", power);

    }
}
