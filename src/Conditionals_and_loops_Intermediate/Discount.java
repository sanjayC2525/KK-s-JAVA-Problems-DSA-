package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Total Amount:");
        double amount = input.nextDouble();
        if(amount <= 0){
            System.out.println("Enter a Valid Amount");
            return;
        }
        System.out.println("Enter the Discount:");
        double discount = input.nextDouble();

        if(discount <= 0 || discount > 100){
            System.out.println("Enter a Valid Discount Between 1-100");
            return;
        }
        double finalPrice = amount - (amount * discount/100);
        System.out.printf("The Total Amount was %.2f with the Discount of %.2f percent The Final Price is %.2f",amount,discount,finalPrice);
    }
}
