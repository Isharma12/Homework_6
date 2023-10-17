package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 */
public class Programme_17Decimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        //Convert decimal to binary
        String binaryNumber = decimalToBinary(decimalNumber);

        //Display the result
        System.out.println("Binary Equivalent: " + binaryNumber);
        scanner.close();

    }
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";

        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;

        }
        return binary.toString();
    }
    }