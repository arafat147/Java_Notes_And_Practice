package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class J_Finally {
    // finally : is a block associated with try or try-catch. it is used to do clean up code. such as- closing database, scanners,
    // and other operations

    /*


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

        try{
            System.out.println("this is inside try block");
            throw new Exception("Inside Try Block");
        }catch(Exception e){
            System.out.println("the exception is inside the try block");
        }
        finally {
            System.out.println("inside the finally block");
        }


    // finally will always come with try block. without a try block it will give error. the below try block will give
    // exception in console but it will still run the finally block.

        try{
            System.out.println(10/0);
        }finally {
            System.out.println("this is second finally block");
        }

    }



}
