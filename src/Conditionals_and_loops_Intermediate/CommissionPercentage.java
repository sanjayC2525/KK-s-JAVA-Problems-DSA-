package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Total Sales Amount:");
        double amount = input.nextDouble();
        if(amount <= 0){
            System.out.println("Total Sales Must be greater than 0");
            return;
        }
        System.out.println("Enter the Commission Percentage:");
        double percentage = input.nextDouble();
        if(percentage <= 0 || percentage > 100){
            System.out.println("Enter a Commission percentage between 1-100");
            return;
        }
        double commission = amount * percentage / 100;
        double netAmount = amount - commission;
        System.out.printf("Total Sales :%.2f",amount);
        System.out.println();
        System.out.printf("Commission Percentage :%.2f",percentage);
        System.out.println();
        System.out.printf("Commission :%.2f",commission);
        System.out.println();
        System.out.printf("Net Amount After Commission :%.2f",netAmount);
        input.close();
    }
}
