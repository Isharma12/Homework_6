package homework_week_6;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 */

public class Programme_14Perimeter {
    public static void main(String [] args){
        //Test data
        double width = 5.6;
        double height = 8.5;

        // Calculator area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);

        //Print the results
        System.out.println("Area is " + width + " * " + height + " = " + String.format("%.2f", area));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + String.format("%.2f", perimeter));

    }

}
