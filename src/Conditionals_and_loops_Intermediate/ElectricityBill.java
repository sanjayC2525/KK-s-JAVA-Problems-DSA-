package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Units of Electricity Used:");
        int num = in.nextInt();
        final int Rate1 = 3;
        final int Rate2 = 5;
        final int Rate3 = 8;
        final int MAX_SLAB_1 = 100;
        final int MAX_SLAB_2 = 100;
        if(num < 0){
            System.out.println("Negative Input Invalid");
        }else {
            int remaining = num;

            int SlabUnit1 = Math.min(remaining, MAX_SLAB_1);
            remaining -= SlabUnit1;
            int SlabUnit2 = Math.min(remaining, MAX_SLAB_2);
            remaining -= SlabUnit2;
            int SlabUnit3 = remaining;

            int price1 = SlabUnit1 * Rate1;
            int price2 = SlabUnit2 * Rate2;
            int price3 = SlabUnit3 * Rate3;
            int Total = price1 + price2 + price3;
            System.out.printf("The Total price for the %d Unit used is %d", num, Total);
        }
        in.close();
    }
}