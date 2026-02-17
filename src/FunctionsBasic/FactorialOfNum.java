package FunctionsBasic;
import java.util.Scanner;
public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();
        int fact = factorial(num);
        System.out.printf("Factorial of %d is %d",num,fact);
        input.close();
    }

    static int factorial(int num){
        int sum = 1;
        for(int i = 1; i <= num; i++){
            sum *= i;
        }
        return sum;
    }
}
