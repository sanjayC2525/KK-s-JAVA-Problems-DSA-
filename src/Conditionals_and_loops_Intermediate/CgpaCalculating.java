package Conditionals_and_loops_Intermediate;
import java.util.Scanner;
public class CgpaCalculating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter the No of Subjects");
        int sub = input.nextInt();
        if(sub <=0 ){
            System.out.println("Enter Minimum 1 Subject To Calculate");
            return;
        }
        for(int i = 1; i <= sub; i++){
            System.out.println("Enter the CGPA for Subject "+i+" between 1-10 :");
            double grade =  input.nextDouble();
            if(grade < 0 || grade > 10){
                System.out.println("Cgpa exceeds given Condition");
                return;
            }
            sum += grade;
        }
        double average = sum/sub;
        System.out.printf("The CGPA: %.2f ",average);
    }
}
