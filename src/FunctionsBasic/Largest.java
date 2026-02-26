package FunctionsBasic;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int result = largest(n1,n2,n3);
        System.out.println("Largest :" + result);
    }
    static int largest(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }else {
            return num3;
        }
    }
}
