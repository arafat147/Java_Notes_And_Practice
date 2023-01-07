package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class J_Finally {


    // finally : is a block associated with try or try-catch. it is used to do clean up code. such as- closing database, scanners,
    // and other operations.
    // **** main purpose of finally block is that - if any database connections or scanners or anything associated
    // with the try block, to close those connections we need to use finally block.

    /*


    Syntax:

    try{
    // risky codes;
    }
    catch(){
    // handling exception
    }
    finally{
    //cleanup code
    }


     */


    public static void main(String[] args) {

        try {
            System.out.println("this is inside try block");
            throw new Exception("Inside Try Block");
        } catch (Exception e) {
            System.out.println("the exception is inside the try block");
        } finally {
            System.out.println("inside the finally block");
        }


        // finally will always come with try block. without a try block it will give error. the below try block will give
        // exception in console but it will still run the finally block.

        try {
            System.out.println(10 / 0);
        } catch (Exception e){
            System.out.println("this is arithmetic exception");
        }
        finally {
            System.out.println("this is second finally block");
        }

    }


}
