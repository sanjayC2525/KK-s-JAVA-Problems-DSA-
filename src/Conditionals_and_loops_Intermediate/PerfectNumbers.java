package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = input.nextInt();
        int test = num;
        if(num <= 0){
            System.out.println("Enter Number Greater than 0");
            return;
        }
        int sum = 0;
        for(int i = 1; i <= num/2; i++) {
            if(num%i==0){
                sum += i;
            }
        }
        if(sum == test){
            System.out.println("Perfect");
        }else{
            System.out.println("Not Perfect");
        }
    }
}
