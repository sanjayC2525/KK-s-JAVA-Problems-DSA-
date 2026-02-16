package FunctionsBasic;
import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();
        if(age < 0 || age > 75){
            System.out.println("Enter a Valid age from 0 - 75");
            return;
        }
        boolean  eligibility = isEligible(age);
        if(eligibility){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        input.close();
    }
    static boolean isEligible(int age){
        return age >= 18;
    }
}
