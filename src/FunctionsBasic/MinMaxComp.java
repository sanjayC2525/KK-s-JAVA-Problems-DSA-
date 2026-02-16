package FunctionsBasic;
import java.util.Scanner;
public class MinMaxComp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int[] result = minMax(a,b,c);
        System.out.println("Minimum : "+ result[0]);
        System.out.println("Maximum : "+ result[1]);
        input.close();
    }
    static int[] minMax(int a, int b, int c){
        int minValue = a;
        int maxValue = a;

        if(b < minValue) minValue = b;
        if(c < minValue) minValue = c;
        if(b > maxValue) maxValue = b;
        if(c > maxValue) maxValue = c;

        return new int[] {minValue,maxValue};
    }
}
