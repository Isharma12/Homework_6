package homework_week_6;

/**
 * Write a Java program to swap two variables.
 */

public class Programme_15SwapVariables {
    public static void main(String [] args){

        int firstVariable = 5;
        int secondVariable = 10;

        System.out.println("Before swapping: ");
        System.out.println("First Variable: " + firstVariable);
        System.out.println("Second Variable: " + secondVariable);

        //Swap the variables
        int temp = firstVariable;
        firstVariable = secondVariable;
        secondVariable  = temp;

        System.out.println("\nAfter swapping: ");
        System.out.println("First Variable: " + firstVariable);
        System.out.println("Second Variable: " + secondVariable);

    }
}
