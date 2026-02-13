package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String:");
        String word = in.nextLine();
        StringBuilder reverse = new StringBuilder();
        int length = word.length();
        for(int i = length-1; i >=0; i--){
            reverse.append(word.charAt(i));
        }
        System.out.println(reverse);
        in.close();
    }
}
