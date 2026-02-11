package Conditionals_and_loops.Basics;
import java.util.Scanner;
public class VolumeOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Volume of Cone
        System.out.println("Enter the Radius & Height for Volume of Cone:");
        double radius = input.nextDouble();
        double height = input.nextDouble();
        if(radius <= 0 || height <= 0){
            System.out.println("Invalid Input");
        }else{
            double volume = (1.0/3.0) * Math.PI *(radius * radius)*height;
            System.out.printf("Volume of cone %.2f \n",volume);
        }
        // 2. Volume of Prism
        System.out.println("Enter Base Area & height for Volume of Prism:");
        double baseArea = input.nextDouble();
        double height1 = input.nextDouble();
        if(baseArea <= 0 || height1 <= 0){
            System.out.println("Invalid Input");
        }else{
            double volume1 = baseArea * height1;
            System.out.println(volume1);
        }
        // 3. Volume of Cylinder
        System.out.println("Enter the Radius & Height for Volume of Cylinder:");
        double radius1 = input.nextDouble();
        double height2 = input.nextDouble();
        if(radius1 <= 0 || height2 <= 0){
            System.out.println("Invalid input");
        }else{
            double volume3 = Math.PI*(radius1*radius1)*height2;
            System.out.printf("%.2f \n",volume3);
        }
        // 4. Volume of Sphere
        System.out.println("Enter the Radius for Volume of Sphere:");
        double radius2 = input.nextDouble();
        if(radius2 <= 0){
            System.out.println("Invalid Input");
        }else{
            double sphere = (4.0/3.0)*Math.PI*(radius2*radius2*radius2);
            System.out.printf("%.2f\n",sphere);
        }
        // 5. Volume of Pyramid
        System.out.println("Enter Base Area and Height for Volume of Pyramid:");
        double baseArea1 = input.nextDouble();
        double height3 = input.nextDouble();
        if(baseArea1 <= 0 || height3 <= 0){
            System.out.println("Invalid Input");
        }else{
            double pyramid = (1.0/3.0)*baseArea1*height3;
            System.out.println(pyramid);
        }

    }
}
