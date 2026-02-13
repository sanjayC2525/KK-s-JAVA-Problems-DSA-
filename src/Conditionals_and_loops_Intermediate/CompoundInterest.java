package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal Amount:");
        double principal = in.nextDouble();
        if(principal <= 0){
            System.out.println("Principal amount must be greater than 0");
            return;
        }
        System.out.println("Enter the Rate of Interest (ex: 10 = 10%):");
        double rate = in.nextDouble();
        if(rate < 0 || rate >100){
            System.out.println("Interest percent must be between 0-100");
            return;
        }
        System.out.println("Enter the No of Years:");
        int year = in.nextInt();
        if(year < 0){
            System.out.println("Year cannot be negative");
            return;
        }
        double finalAmount = principal;
        for(int i = 1; i <= year; i++){
            double increase = finalAmount * (rate/100);
            finalAmount += increase;
        }
        System.out.printf("The Final Amount After %d years is : %.2f",year,finalAmount);
        in.close();
    }
}
