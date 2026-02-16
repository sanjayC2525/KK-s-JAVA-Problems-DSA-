package FunctionsBasic;
import java.util.Scanner;
public class SumAndProd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 Number:");
        int a = input.nextInt();
        int b = input.nextInt();

        int[] result = sumAndProduct(a,b);

        System.out.println("Sum :" + result[0]);
        System.out.println("Product :" + result[1]);

        input.close();
    }
    static int[] sumAndProduct(int a, int b){

        int sum = a + b;
        int prod = a * b;
        return new int[]{sum,prod};
    }
}
