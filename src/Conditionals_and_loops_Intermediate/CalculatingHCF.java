package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class CalculatingHCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1 = input.nextInt();

        System.out.println("Enter Number 2:");
        int num2 = input.nextInt();

        if(num1 < 0 || num2 < 0){
            System.out.println("Number Cannot be Negative");
            return;
        }

        if(num1 == 0 && num2 == 0){
            System.out.println("Both Numbers cannot be 0");
            return;
        }

        int a = num1;
        int b = num2;

        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int gcd = a;

        long Lcm = (long) num1*num2/gcd;

        System.out.println("HCF :"+gcd);
        System.out.println("LCM :"+Lcm);
        input.close();
    }
}
