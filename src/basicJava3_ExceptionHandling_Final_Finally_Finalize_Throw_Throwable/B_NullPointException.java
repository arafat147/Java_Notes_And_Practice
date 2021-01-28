package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class B_NullPointException {

    public static void main(String[] args) {


        String stName = null;
        try {
            System.out.println(stName.length());
            // this will give us null point exception because we are trying to get the length of a null value.
        }catch(Exception e){
            System.out.println("This is null point exception!");
        }
    }

}
