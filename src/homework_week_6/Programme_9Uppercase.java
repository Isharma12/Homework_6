package homework_week_6;

import java.util.Scanner;

/**
 *Write a program to convert the upper case to lower case.
 */

public class Programme_9Uppercase {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a string in uppercase: ");
        String Input = scanner.nextLine();

        //Convert to lowercase
        String lowercase = Input.toLowerCase();

        System.out.println("Uppercase: " + Input);
        System.out.println("Lowercase: " + lowercase);

        scanner.close();


    }





}
