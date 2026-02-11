package Conditionals_and_loops.Basics;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter the Num to Add & 0 to exit After finishing:");
            int num = input.nextInt();
            if(num == 0){
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
