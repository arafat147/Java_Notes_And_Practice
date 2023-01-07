package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class A_ExceptionHandling {


    // Exception- Definition: unexpected event that disturbs the normal flow of a program.
    // Meaning of Exception Handling: defining alternative way to continue rest of the program normally.

    // Purpose of Exception handling: the main purpose of exception handling is to gracefully terminate our program.
    // if something goes wrong we should not loose any resources or block any resources. that's why we need exception
    // handling.
    //
    // look at the below two methods. doStuff method has an error but doMoreStuff method doesn't.
    // so, when i called them accordingly, in main method, after doStuff method gets executed with the error,
    // jvm will not go further methods to call. which means - THERE IS NO ALTERNATIVE WAY TO RUN REST OF THE PROGRAM.
    // THAT'S WHY WE NEED TRY-CATCH BLOCK TO HANDLE ANY UNEXPECTED EVENTS AND RUN THE REST OF THE PROGRAM.

    public static void doStuff() {
        System.out.println(10 / 0);
    }

    public static void doMoreStuff() {
        System.out.println("Hi all");
    }

    public static void main(String[] args) {

        doStuff();
        doMoreStuff();
//        System.out.println("but i am running");

//        try{
//            System.out.println("Please run this code");
//
//        }catch(Exception a){
//            System.out.println("this is an arithmetic Exception");
//        } finally{
//            System.out.println("Please run this code");
//            System.out.println(10/0);
//        }

//    try {
//        System.out.println(8 / 0);
//    }catch(Exception e){
//        e.printStackTrace();
//    }
//
//
//        System.out.println("Hi");
//

    }

}
