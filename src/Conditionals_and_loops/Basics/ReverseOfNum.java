package Conditionals_and_loops.Basics;
import java.util.Scanner;
public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Num");
        int num = input.nextInt();
        int newNum = 0;
        while(num > 0){
            int last = num%10;
            newNum = newNum * 10 + last;
            num /= 10;
        }
        System.out.println(newNum);
    }
}
