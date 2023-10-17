package homework_week_6;

public class Programme_2 {
    /**
     * 1.Declare two static variables
     * 2.Declare one static method
     * 3.Call both static variables into the static method inside the print statement.
     * 4.Declare the Main method.
     * 5.Call the static method into the Main method and Run the programme.
     */
    // static method
    static int a = 20;
    static String name = "Indu";


    public void m1(){
        System.out.println(a);
        System.out.println(Programme_2.name);

    }

    public static void main(String [] args){
        System.out.println(a);
        System.out.println(Programme_2.a);
        System.out.println(name);
        System.out.println(Programme_2.name);

    }
}
