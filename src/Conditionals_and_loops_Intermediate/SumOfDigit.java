package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = in.nextInt();

        if(num < 0){
            System.out.println("Enter a positive Number");
            return;
        }

        int sum = 0;
        while(num > 0){
            int temp = num%10;
            sum += temp;
            num /= 10;
        }
        System.out.println(sum);
        in.close();
    }
}
