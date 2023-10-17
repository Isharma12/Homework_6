package homework_week_6;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 */
public class Programme_19Lowercase {
    //Java program to convert a string into lowercase

    public static void main(String []args){

        String input = " THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String lowercase = input.toLowerCase();
        System.out.println("Original: " + input);
        System.out.println("Lowercase:" + lowercase);

    }
}
