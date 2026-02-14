package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Year:");
        int year = input.nextInt();

        if(year <= 0){
            System.out.println("Enter a Valid year Greater Than 0");
            return;
        }

        if(year % 400 == 0) {
            System.out.println("Leap Year");
        }
        else if(year % 100 == 0){
            System.out.println("Not Leap Year");
        }
        else if (year % 4 == 0) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
