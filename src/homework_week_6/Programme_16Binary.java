package homework_week_6;
/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */

import java.util.Scanner;

public class Programme_16Binary{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first binary number: ");
        String binary1 = scanner.next();
        System.out.println("Input second binary number: ");
        String binary2 = scanner.next();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;

        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: " + binarySum);
        scanner.close();

    }
    }



