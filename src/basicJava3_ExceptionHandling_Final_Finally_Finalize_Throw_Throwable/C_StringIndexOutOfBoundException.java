package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class C_StringIndexOutOfBoundException {

    static String line = "this is a non static global variable";

    public static void main(String args[]) {
//        String a = "This is like chipping "; // length is 22
//        try {
//
//            char c = a.charAt(25); // accessing 25th element
//            System.out.println(c);
//        } catch (Exception e) {
//            System.out.println("StringIndexOutOfBoundsException");
//            //e.printStackTrace();
//        }


 //       stringException();
       practiceException();
    }


    public static void stringException() {
        String text = "i am still learning";
        try {
            char a = text.charAt(30);
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void practiceException(){
        try{
            char a = line.charAt(78);
            System.out.println(a);
        }catch(Exception e){
          //  e.printStackTrace();
            System.out.println("this is String index out of bound exception");
        }
    }


}


