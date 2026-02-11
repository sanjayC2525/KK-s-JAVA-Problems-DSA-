package Conditionals_and_loops.Basics;
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int largest = 0;
        while(true){
            System.out.println("Enter a Num to find Largest & 0 to Exit:");
            int num = in.nextInt();
            if(num == 0){
                break;
            }
            if(num > largest){
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
