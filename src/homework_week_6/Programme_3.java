package homework_week_6;

public class Programme_3 {
    /**
     *1. Declare one instance and one static variable.
     *2. Declare one instance method.
     *3.Declare one static method.
     *4. Call both instance and static variables into both instance and static methods inside the
     * print statement.
     *5. Declare the Main method.
     *6. Call both instance and static methods into the Main method and run the programme.
     */


    int a = 200;
    static String name = "Indu";

    //Static method
    public static void m1(){
        Programme_3 obj = new Programme_3();
        System.out.println(obj.a);
        System.out.println(obj.name);


    }
    //Instance method
    public void method1(){
        Programme_3 c1 = new Programme_3();
        System.out.println(c1.a);
        System.out.println(c1.name);

    }
    //Main method
     public static void main(String [] args){
        Programme_3 obj = new Programme_3();
        Programme_3 c1 = new Programme_3();
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(c1.a);
        System.out.println(c1.name);
     }

}
