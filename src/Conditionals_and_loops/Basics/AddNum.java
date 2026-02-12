package Conditionals_and_loops.Basics;
import java.util.Scanner;
public class AddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Number:");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a+b;
        System.out.println("Sum of Two Number :"+sum);
    }
}
