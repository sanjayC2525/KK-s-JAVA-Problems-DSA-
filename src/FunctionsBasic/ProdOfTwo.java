package FunctionsBasic;
import java.util.Scanner;
public class ProdOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Num1:");
        long num1 = input.nextLong();
        System.out.println("Enter Num2:");
        long num2 = input.nextLong();

        long prod = product(num1,num2);
        System.out.println("product :"+ prod);
        input.close();
    }

    static long product(long a , long b){
        return a * b;
    }
}