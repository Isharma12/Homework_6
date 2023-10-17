package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and covert to degree Celsius ((F-32)* 5/9 = 0 degree celsius)
 */

public class Programme_7Temperature {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println(fahrenheit + " F is equal to " + celsius +  "c");

        scanner.close();
    }



}
