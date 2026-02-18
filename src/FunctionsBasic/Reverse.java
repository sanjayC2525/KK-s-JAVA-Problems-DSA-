package FunctionsBasic;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse :"+reverse);
        input.close();
    }
    static int reverse(int num){
        int reverse = 0;
        while(num > 0){
            int left = num%10;
            reverse = reverse * 10 + left;
            num /= 10;
        }
        return reverse;
    }
}
