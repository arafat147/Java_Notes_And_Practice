package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;


public class H_Throws_Keyword {

    static int a;
    int b;

    public static void division() throws ArithmeticException {
//        when we can see there might an error in our method, then we can declare throws exception after method name.
//
//         to see how it works, just call the method without the try catch block and it will show us an error. just as in line 26.
        H_Throws_Keyword t1 = new H_Throws_Keyword();
        int x = t1.a = 12;
        int y = t1.b = 0;
        int total = x / y;
        System.out.println(total);


    }
    public static void practiceThrows() throws ArithmeticException{
        int a = 5;
        int b = 0;
        System.out.println(a/b);
    }

    public static void main(String[] args) {
//        try {
//
//            H_Throws_Keyword.division();
//
//        } catch (Exception e) {
//            System.out.println("This is arithmetic exception");
//        }

//          H_Throws_Keyword.division();


//        System.out.println("Hello all, this is from main method!");
//
//        try {
//            practiceThrows();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }


}
