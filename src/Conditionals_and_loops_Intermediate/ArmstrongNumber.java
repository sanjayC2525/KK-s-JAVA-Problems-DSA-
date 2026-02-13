package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = input.nextInt();
        int digitComparison = num;
        int finalComparison = num;
        int count = 0;
        if(num < 0){
            System.out.println("No Negative Number Allowed");
            return;
        }
        do {
            count ++;
            num /= 10;
        }while(num > 0);

        int armstrong = 0;
        int powerNum = count;
        while(digitComparison > 0){
            int left = digitComparison%10;
            int pow = (int) Math.pow(left,powerNum);
            digitComparison /= 10;
            armstrong += pow;
        }
        if(armstrong == finalComparison){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        input.close();
    }
}
