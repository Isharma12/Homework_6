package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class Programme_13AverageCalculator {
    public static void main(String [] args){
    //Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter three numbers
        System.out.println("Enter three number:");

        //Read the three numbers from the user
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        scanner.close();

        // Calculate the average of the three numbers
        double average = (number1 + number2 + number3)/3;
        System.out.println(" The average of the three numbers is : " + average);

    }
}
