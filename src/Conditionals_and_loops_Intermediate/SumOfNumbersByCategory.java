package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class SumOfNumbersByCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfNegative = 0;
        int sumOfPositiveEven = 0;
        int sumOfPositiveOdd = 0;

        while(true){
            System.out.println("Enter the Number :");
            int num = input.nextInt();
            if(num < 0){
                sumOfNegative += num;
            }
            else if (num > 0 && num % 2 == 0) {
                sumOfPositiveEven += num;
            }
            else if (num > 0 && num % 2 != 0) {
                sumOfPositiveOdd += num;
            }
            if(num == 0){
                break;
            }
        }
        System.out.println("Sum Of Negative Numbers:"+sumOfNegative);
        System.out.println("Sum Of Positive Even Numbers:"+sumOfPositiveEven);
        System.out.println("Sum Of Positive Odd Numbers:"+ sumOfPositiveOdd);
        input.close();
    }
}