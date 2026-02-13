package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to Check if it's Palindrome:");
        int num = in.nextInt();
        if(num < 0){
            System.out.println("Enter a positive Number");
            return;
        }
        int tempNum = num;
        int reverse = 0;
        while(num > 0){
            int temp = num%10;
            reverse = reverse * 10 + temp;
            num /= 10;
        }
        if(tempNum == reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
