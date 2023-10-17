package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its multiplication
 * table up to 10
 * Test data: Input a number:8
 */

public class Programme_10InputMultiply {
    public static void main(String [] args){
        //Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter a number
        System.out.print("Input a number:");
        int number = scanner.nextInt();
        scanner.close();

        //Print the multiplication table up to 10
        for (int i = 1; i <= 10; i++){
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);

        }

    }
}
