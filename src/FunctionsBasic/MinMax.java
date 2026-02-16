package FunctionsBasic;
import java.util.Scanner;
public class MinMax {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int minValue = min(a,b,c);
        int maxValue = max(a,b,c);
        System.out.println("Minimum :"+ minValue);
        System.out.println("Maximum :"+ maxValue);
        input.close();
    }
    static int min(int a, int b, int c){
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        return  min;
    }

    static int max(int a, int b, int c){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }
}
