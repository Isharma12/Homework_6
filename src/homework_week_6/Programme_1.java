package homework_week_6;

public class Programme_1 {

    /**
     *1. Declare two instance variables.
     *2. Declare one instance method.
     *3. Call both instance variables into the instance method inside the print statement.
     *4. Declare the Main method.
     *5. Call the above instance method into the Main method and Run the programme.
     */


    // instance method
    int a = 10;
    int b = 20;

    public void m1() {
        Programme_1 t1 = new Programme_1();
        System.out.println(t1.a);
        System.out.println(t1.b);

    }

    public static void main(String[] args){
        Programme_1 t1 = new Programme_1();
        System.out.println(t1.a);
        System.out.println(t1.b);


    }



}

