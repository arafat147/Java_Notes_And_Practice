package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class I_Final {// extends L_FinalClassTest {
    //final is a modifier applicable for class,methods and variables.

    //if a class is final : we can not extend that class also we can not create child class for that class
    //if a method is final : we ca not override that method in a child class
    // if variable is final : we can not re assign that variable. meaning it's constant.

    //    public final static void start(){
//        remove final from L_FinalClassTest and extend it in this class to see how it works for methods:
//    }

    public final void doStuff() {
        System.out.println("asdfhasdk");
    }
    public static final String name = "alex";

    // we have the same method in its parent class the one it extends. so to stop inheritance of the parent class,
    // we use final before that class name and it will give us errors in here.
    // same way if we make the start method in parent class as final, we can not override that method as well.


    public static void main(String[] args) {

        //variable final.
        final int a = 10;
        //  a = 20;
        //  a= 30;
        System.out.println(a);
        //  I_Final.start();
        System.out.println(name);
    }
}
