package FunctionsBasic;
import java.util.Scanner;
public class SumOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Num1:");
        long num1 = input.nextLong();
        System.out.println("Enter Num2:");
        long num2 = input.nextLong();

        long sum = sum(num1,num2);
        System.out.println("Sum : "+ sum);

        input.close();
    }
    static long sum(long a, long b){
        return a+b;
    }
}
