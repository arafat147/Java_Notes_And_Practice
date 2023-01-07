package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class K_Finalize {


    // finalize is a method inside Object class in java. this terminology is applicable for garbage collector.
    // it(Garbage Collector) cleans up the un used objects of a class.
    // finalize method is invoked each time before the object is destroyed by the Garbage Collector.
    // this method is basically used to close any database connections.

    // to understand a little bit more, let's see what is Garbage Collector:
    // As long as an object is being referenced, the JVM considers it alive. Once an object is no longer referenced
    // and therefore is not reachable by the application code, the garbage collector removes it and reclaims the unused memory.


    public void doStuff() {
        System.out.println("This is finalize class method");
    }

    public void finalize() {
        System.out.println("close database connections");
    }

    public static void main(String[] args) {

        K_Finalize f1 = new K_Finalize();
        K_Finalize f2 = new K_Finalize();

        f1.doStuff();
        f2.doStuff();
        f1 = null;// see line 12. because-" as long as the object is no longer referenced " we had to make the f1 = null;
        System.gc();

    }

}
