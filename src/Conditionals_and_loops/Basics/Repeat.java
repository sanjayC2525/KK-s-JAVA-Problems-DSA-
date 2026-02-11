package Conditionals_and_loops.Basics;
public class Repeat {
    public static void main(String[] args) {

        int num = 1625667;
        int count = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem == 6){
                count ++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
