package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class AverageOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num of Input to Calculate the Average:");
        int num = input.nextInt();
        if(num <= 0){
            System.out.println("Number of inputs must be positive.");
            return;
        }
        double sum = 0;
        for(int i = 1; i <= num; i++){
            System.out.println("Enter Number " +i+":");
            int number = input.nextInt();
            sum += number;
        }
        double average = sum/num;
        System.out.println(average);
        input.close();
    }
}
