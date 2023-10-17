package homework_week_6;

import java.util.Scanner;

/**
 * Write a programme to calculate the area of a triangle
 */

public class Programme_8AreaOfTriangle {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        //Area = (width*height)/2
        double area = (base* height)/2;
        System.out.println("Area of Triangle is:" + area);
        scanner.close();
    }
}
