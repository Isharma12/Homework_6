package homework_week_6;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division methods all with
 * parameters and use string concatenation methods.
 * (Note: Two static and Two Instance methods)
 */
public class Programme_5Calculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the method (+. -, *, /): ");
        String operation = scanner.next();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        Programme_5Calculator c = new Programme_5Calculator();
        double result = 0.0;
        if (operation.equals("+")) {
            result = add(num1, num2);
        } else if (operation.equals("-")) {
            result = subtract(num1, num2);
        } else if (operation.equals("*")) {
            result = c.multiply(num1, num2);
        } else if (operation.equals("/")) {
            result = c.division(num1, num2);
        } else {
            System.out.println("invalid operation.");
        }
        System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);

        scanner.close();
    }
}




