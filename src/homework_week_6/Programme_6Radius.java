package homework_week_6;
/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Programme_6Radius {


    public static void main(String [] args){
        double pi = 3.142;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Area of radius: ");
        double r = scanner.nextDouble();
        double area = (pi * r * r);
        System.out.print("Area of circle is: " + area);
        scanner.close();

    }
}
