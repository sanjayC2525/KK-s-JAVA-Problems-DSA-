package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch = in.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch < 'a' || ch > 'z'){
            System.out.println("Enter character between a - z only");
            return;
        }
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
           System.out.println("Vowel");
       }
       else{
           System.out.println("Consonant");
       }
    }
}
