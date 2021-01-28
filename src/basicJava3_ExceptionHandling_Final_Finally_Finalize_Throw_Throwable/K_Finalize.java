package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

import basicJava.K_ConditionalOperator;

public class K_Finalize {
    // finalize is a method inside Object class in java. this terminology is applicable for garbage collector.
    // it cleans up the un used objects of a class.



    public static void main(String[] args) {

        K_Finalize f1 = new K_Finalize();
        K_Finalize f2 = new K_Finalize();
        K_Finalize f3 = new K_Finalize();
        K_Finalize f4 = new K_Finalize();


        System.gc();

    }

}
