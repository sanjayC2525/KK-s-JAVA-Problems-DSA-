package FunctionsBasic;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();

        boolean isEven = checkIfEven(num);
        if(isEven){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        input.close();
    }

    static boolean checkIfEven(int num){
        return num % 2 == 0;
    }
}
