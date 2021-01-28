package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class C_StringIndexOutOfBoundException {

    public static void main(String args[])
    {
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(25); // accessing 25th element
            System.out.println(c);
        }
        catch(Exception e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
