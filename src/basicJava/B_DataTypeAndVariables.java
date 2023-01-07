package basicJava;

public class B_DataTypeAndVariables {

    //dataType:
    //primitive:
    int rollNumber = 102;
    byte classNumber = 120;
    short pinNumber = 10020;
    long ssnNumber = 737657042;
    double retailPrice = 1200.59;
    float wholeSalePrice= 150000000f;
    char nameInitial = 'A';
    boolean result = true;

    //Non-Primitive:
    static String studentName= "Alex";
    static String car = "Bmw";




    // Global variables:

    //1. non static global variables can be used inside non static methods only:
    String name= "alex";
    int x = 25;
    //Example:
    public void doStuff(){
        x=30;
        studentName ="tom";
        System.out.println(x);
        System.out.println(studentName);

    }
    public static void doMoreStuff(){
      //  x=30; this
      // name = "tom";
    }
    //2. static global variables can be used in both static and non static methods: because static keyword is for class level.

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
    //1. local variables can not be static: because static keyword is used for the whole class level usage. if a local
    //variable is static then it will be limited to it's functions and therefore it will violate the the purpose of
    // static.
    public static void doStuff3(){
     //  static int x = 25; this will give us an exception
    }

    public void doMoreStuff3(){
     //   static int y = 50; this will give us an exception
    }
}
