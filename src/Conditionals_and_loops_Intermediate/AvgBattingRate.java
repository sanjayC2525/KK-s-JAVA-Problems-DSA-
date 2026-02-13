package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class AvgBattingRate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Runs Scored:");
        int runs = in.nextInt();
        if(runs < 0){
            System.out.println("Runs cannot be negative");
            return;
        }
        System.out.println("Enter the No of Wickets:");
        int out = in.nextInt();
        if(out == 0){
            System.out.println("Division By 0 illegal");
            return;
        }
        if(out < 0){
            System.out.println("Wickets cannot be negative");
        }
        double average = (double) runs/out;
        System.out.printf("The Average :%.2f",average);
        in.close();
    }
}
