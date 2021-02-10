package basicJava;

public class B_DataTypeAndVariables {

    // Global variables:

    //1. non static global variables can be used inside non static methods only:
    String name= "alex";
    int x = 25;
    //Example:
    public void doStuff(){
        x=30;
        name="tom";
        System.out.println(x);
        System.out.println(name);

    }
    public static void doMoreStuff(){
      //  x=30; this
      // name = "tom";
    }
    //2. static global variables can be used in both static and non static methods:

    static double price = 1200.99;
    static char size = 'M';

    public static void doStuff2(){
        price = 1100.99;
        size = 'L';
    }
    public void doMOreStuff2(){
        price = 999.99;
        size = 'S';
    }

    //##################################################################################################################
    // Local Variable:
    //1. local variables can not be static:
    public static void doStuff3(){
     //  static int x = 25; this will give us an exception
    }

    public void doMoreStuff3(){
     //   static int y = 50; this will give us an exception
    }
}
