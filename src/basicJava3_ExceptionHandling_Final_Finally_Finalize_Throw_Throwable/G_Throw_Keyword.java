package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

import static javax.security.auth.callback.ConfirmationCallback.NO;

public class G_Throw_Keyword {



    public static void main(String[] args) {

        // throw keyword is used to provide explicit exceptions in a program.
        // throw keyword should be inside of a method and we can give it any name while declaring it.
        // it's a good practice to use throw keyword inside the try-catch block otherwise the program will terminate -
        // at the declaration and won't run further code.


        //example 1:
        System.out.println("Hello");


//
//        try{
//
//            throw new Exception("Arafat's Exception");
//        }catch(Exception e){
//            e.printStackTrace();
//            //System.out.println("aslkdjhglkjasd");
//        }



        //example 2:
        String flag_flying = "N";
        if (flag_flying.equals("N")){
            try {
                throw new Exception("Arafat's exception");
            } catch (Exception e) {
                //System.out.println("flag flying answer is not in full word ");
                e.printStackTrace();
            }
        }
        System.out.println("Hi");


    }



}
