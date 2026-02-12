package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Amount :");
        double amount = in.nextDouble();
        if(amount <= 0){
            System.out.println("Amount must be Positive to Calculate");
            return;
        }
        System.out.println("Enter depreciation rate as a percentage (e.g., 10 for 10%): ");
        double percentage = in.nextDouble();
        if(percentage < 0 || percentage >100){
            System.out.println("Depreciation rate must be between 0 and 100 (inclusive).");
            return;
        }
        System.out.println("Enter the time in years:");
        int years = in.nextInt();
        if(years < 0){
            System.out.println("Years cannot be negative.");
            return;
        }
        //Compound depreciation: each year value reduces based on previous year’s value
        double finalValue;
        if(years == 0){
            finalValue = amount;
        } else if (percentage == 100) {
            finalValue = 0;
        }else{
            finalValue = amount * Math.pow((1-percentage/100),years);
        }
        System.out.printf("The Initial Amount was %.2f and the Depreciation of %.2f percent for each year for %d years the Final Value is : %.2f",amount,percentage,years,finalValue);
        in.close();
    }
}
