import java.util.Scanner;

public class TableOfNum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    for(int i =1; i <=10 ; i++){
        int result = num * i;
        System.out.println(num +"x"+ (i)+"= "+result);
    }
    }
}
