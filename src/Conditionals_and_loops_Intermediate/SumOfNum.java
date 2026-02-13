package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int size = in.nextInt();
        if(size < 0){
            System.out.println("Range Must be greater then 0");
            return;
        }
        int sum = 0;
        for(int i = 1; i <= size; i++){
            System.out.println("Enter Number "+i+" :");
            int num = in.nextInt();
            sum += num;
        }
        System.out.printf("The sum of %d Numbers is : %d",size,sum);
    }
}
