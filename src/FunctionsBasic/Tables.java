package FunctionsBasic;
import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = input.nextInt();
        Calculation(number);
        input.close();
    }
    static void Calculation (int num){
        int result = 0;
        for(int i = 1; i <= 10; i++){
            result = i * num;
            System.out.println(num + " x " + i + " = " +result);
        }
    }
}
