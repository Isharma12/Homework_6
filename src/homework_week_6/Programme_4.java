package homework_week_6;

/**
 *1. Declare two instance and two static variables.
 *2. Declare one instance method.
 *3. Declare one static method.
 *4. Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 *5. Declare the Main method.
 *6. Call both instance and static methods into the Main method and run the programme.
 */

public class Programme_4 {
    //Instance variables
    int a = 10;
    int b = 20;
    //Static variable
    static String name = "Indu";
    static String job = "Tester";

    //Instance Method
    public void m1(){
        Programme_4 obj1 = new Programme_4();
        Programme_4 obj2 = new Programme_4();
        System.out.println(obj1.a);
        System.out.println(obj2.b);

    }
    //Static Method
    public static void MyMethod() {
        Programme_4 c1 = new Programme_4();
        Programme_4 c2 = new Programme_4();
        System.out.println(c1.name);
        System.out.println(c2.job);
    }
    //Main Method
    public static void main(String [] args){
        Programme_4 obj1 = new Programme_4();
        Programme_4 obj2 = new Programme_4();
        Programme_4 c1 = new Programme_4();
        Programme_4 c2 = new Programme_4();
        System.out.println(obj1.a);
        System.out.println(obj2.b);
        System.out.println(c1.name);
        System.out.println(c2.job);


    }



}

