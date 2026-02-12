package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number to find the Factorial:");
        int num = in.nextInt();
        final int Max_Safe = 20;
        long fact = 1;
        if(num < 0){
            System.out.println("Factorial is not defined for negative numbers");
        } else if (num == 0) {
            System.out.println(fact);
        } else if (num > Max_Safe) {
            System.out.println("Factorial overflows long beyond 20");
        }else {
            for(int i = 1; i <= num; i++){
                fact *= i;
            }
            System.out.println(fact);
        }
        in.close();
    }
}
