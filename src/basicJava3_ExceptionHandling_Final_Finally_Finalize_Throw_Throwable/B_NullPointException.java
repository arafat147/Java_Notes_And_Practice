package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class B_NullPointException {

    public static void main(String[] args) {
        String stName = null;
        System.out.println(stName.length());
        // this will give us null point exception because we are trying to get the length of a null value.
        // to handle this we can put the code inside the try catch block.
    }

}
