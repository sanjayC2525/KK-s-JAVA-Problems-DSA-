package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class EvenDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Days in Month");
        int days = input.nextInt();

        if(days <= 0 || days > 31){
            System.out.println("Enter the days between 1 - 31");
            return;
        }
        int count = 0;
        for(int i = 1; i <= days; i++){
            if(i % 2 == 0){
                count ++;
            }
        }
        System.out.println("The Number of Even Days is :"+count);
    }
}
