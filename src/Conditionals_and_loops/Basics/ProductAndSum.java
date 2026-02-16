package Conditionals_and_loops.Basics;
import java.util.Scanner;
public class ProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        int prod = 1;
        while(n > 0){
            int last = n%10;
            sum += last;
            prod *= last;
            n = n/10;
        }
        int result = prod - sum;
        System.out.println(result);
    }
}
