package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

import basicJava.K_ConditionalOperator;

public class K_Finalize {
    // finalize is a method inside Object class in java. this terminology is applicable for garbage collector.
    // it cleans up the un used objects of a class.
    // finalize method is invoked each time before the object is garbage collected.
    // this method is basically used to close any database connections.
    public void doStuff(){
        System.out.println("This is finalize class method");
    }

    public void finalize(){
        System.out.println("close database connections");
    }

    public static void main(String[] args) {

        K_Finalize f1 = new K_Finalize();
        K_Finalize f2 = new K_Finalize();

        f1.doStuff();
        f2.doStuff();
        f1 = null;


        System.gc();

    }

}
