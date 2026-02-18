package FunctionsBasic;
import java.util.Scanner;
public class FiboSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int num = input.nextInt();
        int sum = fibonacci(num);
        System.out.println("Sum :" + sum);
        input.close();
    }
    static int fibonacci(int num){
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += a;
            int temp = a + b;
            a = b;
            b = temp;
        }
        return sum;
    }
}
