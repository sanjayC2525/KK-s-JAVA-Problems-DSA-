package FunctionsBasic;
import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();
        int duplicate = num;
        int reverse = isPalindrome(num);
        if(duplicate == reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        input.close();
    }
    static int isPalindrome(int num){
        int reverse = 0;
        while(num > 0){
            int last = num%10;
            reverse = reverse * 10 + last;
            num /= 10;
        }
        return reverse;
    }
}
