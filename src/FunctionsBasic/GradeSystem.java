package FunctionsBasic;
import java.util.Scanner;
public class GradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Marks:");
        int marks = input.nextInt();

        String Grade = grade(marks);
        System.out.println("Grade : "+ Grade);
        input.close();
    }

    static String grade(int marks){
        if(marks < 0 || marks > 100){
            System.out.println("Enter a Valid Marks Between 0-100");
        }
        if(marks >= 91) return "AA";
        else if (marks >= 81) return "AB";
        else if(marks >= 71) return "BB";
        else if(marks >= 61) return "BC";
        else if(marks >= 51) return "CD";
        else if(marks >= 41) return "DD";
        else return "FAIL";
    }
}
