package Conditionals_and_loops.Basics;

import java.util.Scanner;
public class SumOfAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        while(true){
            System.out.println("Enter a num :");
            int n = input.nextInt();
            num += n;

            if(n == 1 || n == 2){
                break;
            }
        }
        System.out.println(num);
    }
}
